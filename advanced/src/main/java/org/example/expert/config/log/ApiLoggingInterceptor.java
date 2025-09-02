package org.example.expert.config.log;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.UUID;

@Slf4j
@Component
public class ApiLoggingInterceptor implements HandlerInterceptor {

    private static final String START_TIME = "_startTime";
    private static final String REQUEST_ID = "requestId";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        long start = System.currentTimeMillis();
        request.setAttribute(START_TIME, start);

        // Correlation ID
        String requestId = UUID.randomUUID().toString();
        MDC.put(REQUEST_ID, requestId);
        response.setHeader("X-Request-Id", requestId);

        String method = request.getMethod();
        String uri = request.getRequestURI();
        String query = request.getQueryString();
        String client = request.getRemoteAddr();

        log.info("[{}] -> {} {}{} from {}", requestId, method, uri, query != null ? ("?" + query) : "", client);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        Object startObj = request.getAttribute(START_TIME);
        long elapsed = startObj instanceof Long ? (System.currentTimeMillis() - (Long) startObj) : -1L;
        String requestId = MDC.get(REQUEST_ID);
        int status = response.getStatus();

        if (ex != null) {
            log.warn("[{}] <- status={} elapsed={}ms error={}", requestId, status, elapsed, ex.toString());
        } else {
            log.info("[{}] <- status={} elapsed={}ms", requestId, status, elapsed);
        }

        MDC.remove(REQUEST_ID);
    }
}

