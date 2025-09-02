package org.example.expert.config.log;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.example.expert.domain.auth.exception.AuthException;
import org.example.expert.domain.user.enums.UserRole;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.time.Instant;

@Slf4j
@Component
public class AdminAccessInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        Object roleObj = request.getAttribute("userRole");
        Object userIdObj = request.getAttribute("userId");

        UserRole role = roleObj == null ? null : UserRole.of(String.valueOf(roleObj));
        Long userId = userIdObj instanceof Long ? (Long) userIdObj : null;

        if (role == null || role != UserRole.ADMIN) {
            throw new AuthException("접근 권한이 없습니다.");
        }

        String requestId = MDC.get("requestId");
        String method = request.getMethod();
        String uri = request.getRequestURI();
        String at = Instant.now().toString();

        log.info("[{}] ADMIN ACCESS START userId={} method={} uri={} at={}", requestId, userId, method, uri, at);
        return true;
    }
}

