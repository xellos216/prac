package org.example.expert.config.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class ApiLoggingAspect {

    @Pointcut("within(org.example.expert..controller..*)")
    public void controllerLayer() {}

    @Pointcut("within(org.example.expert..service..*)")
    public void serviceLayer() {}

    @Around("controllerLayer() || serviceLayer()")
    public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
        String requestId = MDC.get("requestId");
        String signature = pjp.getSignature().toShortString();

        Object[] args = pjp.getArgs();
        String safeArgs = Arrays.stream(args)
                .map(this::safeToString)
                .reduce((a, b) -> a + ", " + b)
                .orElse("");

        long start = System.currentTimeMillis();
        log.debug("[{}] ENTER {}({})", requestId, signature, safeArgs);
        try {
            Object result = pjp.proceed();
            long elapsed = System.currentTimeMillis() - start;
            log.debug("[{}] EXIT  {} ({}ms)", requestId, signature, elapsed);
            return result;
        } catch (Throwable t) {
            long elapsed = System.currentTimeMillis() - start;
            log.warn("[{}] ERROR {} ({}ms) cause={}", requestId, signature, elapsed, t.toString());
            throw t;
        }
    }

    private String safeToString(Object arg) {
        if (arg == null) return "null";
        String s = String.valueOf(arg);
        if (s.toLowerCase().contains("password") || s.toLowerCase().contains("secret")) {
            return "***";
        }
        // Avoid dumping large payloads
        return s.length() > 200 ? s.substring(0, 200) + "…" : s;
    }
}

