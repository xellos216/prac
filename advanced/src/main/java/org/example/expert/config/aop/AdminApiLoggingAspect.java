package org.example.expert.config.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class AdminApiLoggingAspect {

    private final ObjectMapper objectMapper;

    @Pointcut("execution(* org.example.expert.domain.comment.controller.CommentAdminController.deleteComment(..))")
    public void deleteCommentApi() {}

    @Pointcut("execution(* org.example.expert.domain.user.controller.UserAdminController.changeUserRole(..))")
    public void changeUserRoleApi() {}

    @Around("deleteCommentApi() || changeUserRoleApi()")
    public Object aroundAdminApis(ProceedingJoinPoint pjp) throws Throwable {
        HttpServletRequest request = currentRequest();
        String uri = request != null ? request.getRequestURI() : "N/A";
        String method = request != null ? request.getMethod() : "N/A";
        Long userId = request != null && request.getAttribute("userId") != null ? (Long) request.getAttribute("userId") : null;
        String at = Instant.now().toString();
        String requestId = MDC.get("requestId");

        String requestBodyJson = toJsonPayload(pjp.getArgs());
        log.info("[{}] ADMIN API ENTER userId={} at={} {} {} body={}", requestId, userId, at, method, uri, requestBodyJson);

        Object result = pjp.proceed();

        String responseBodyJson = toJson(result);
        log.info("[{}] ADMIN API EXIT  userId={} at={} {} {} body={}", requestId, userId, at, method, uri, responseBodyJson);
        return result;
    }

    private HttpServletRequest currentRequest() {
        RequestAttributes attrs = RequestContextHolder.getRequestAttributes();
        if (attrs instanceof ServletRequestAttributes servletAttrs) {
            return servletAttrs.getRequest();
        }
        return null;
    }

    private String toJsonPayload(Object[] args) {
        Map<String, Object> map = new HashMap<>();
        for (int i = 0; i < args.length; i++) {
            Object arg = args[i];
            if (arg instanceof HttpServletRequest) continue;
            map.put("arg" + i, arg);
        }
        return toJson(map);
    }

    private String toJson(Object obj) {
        try {
            if (obj == null) return "null";
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            return '"' + String.valueOf(obj) + '"';
        }
    }
}

