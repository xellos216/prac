package org.example.expert.domain.auth.service;

import lombok.RequiredArgsConstructor;
import org.example.expert.config.JwtUtil;
import org.example.expert.config.PasswordEncoder;
import org.example.expert.domain.auth.dto.request.SigninRequest;
import org.example.expert.domain.auth.dto.request.SignupRequest;
import org.example.expert.domain.auth.dto.response.SigninResponse;
import org.example.expert.domain.auth.dto.response.SignupResponse;
import org.example.expert.domain.auth.exception.AuthException;
import org.example.expert.domain.common.exception.InvalidRequestException;
import org.example.expert.domain.user.entity.User;
import org.example.expert.domain.user.enums.UserRole;
import org.example.expert.domain.user.repository.UserRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

// signup 리팩토링
// Early return: existsByEmail 먼저 검사 후 즉시 예외
// 비용 큰 작업(비밀번호 해시)과 DB I/O는 조건 통과 후 수행
// DB 유니크 제약으로 동시성 보호, 위반 시 DataIntegrityViolationException → 도메인 예외 변환
// 트랜잭션 경계 내에서 일관성 유지(@Transactional)
    @Transactional
    public SignupResponse signup(SignupRequest req) {
        if (userRepository.existsByEmail(req.getEmail())) {
            throw new InvalidRequestException("이미 존재하는 이메일입니다.");
        }

        UserRole role = UserRole.of(req.getUserRole());
        String encoded = passwordEncoder.encode(req.getPassword());
        try {
            User saved = userRepository.save(new User(req.getEmail(), encoded, role));
            String token = jwtUtil.createToken(saved.getId(), saved.getEmail(), role);
            return new SignupResponse(token);
        } catch (DataIntegrityViolationException e) {
            throw new InvalidRequestException("이미 존재하는 이메일입니다.");
        }
    }

    @Transactional(readOnly = true)
    public SigninResponse signin(SigninRequest signinRequest) {
        User user = userRepository.findByEmail(signinRequest.getEmail()).orElseThrow(
                () -> new InvalidRequestException("가입되지 않은 유저입니다."));

        // 로그인 시 이메일과 비밀번호가 일치하지 않을 경우 401을 반환합니다.
        if (!passwordEncoder.matches(signinRequest.getPassword(), user.getPassword())) {
            throw new AuthException("잘못된 비밀번호입니다.");
        }

        String bearerToken = jwtUtil.createToken(user.getId(), user.getEmail(), user.getUserRole());

        return new SigninResponse(bearerToken);
    }
}
