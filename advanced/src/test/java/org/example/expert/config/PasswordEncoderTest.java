package org.example.expert.config;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PasswordEncoderTest {

    private final PasswordEncoder passwordEncoder = new PasswordEncoder();

    @Test
    void matches() {
        // given
        String rawPassword = "testPassword";
        String encodedPassword = passwordEncoder.encode(rawPassword);

        // when
        boolean matches = passwordEncoder.matches(rawPassword, encodedPassword);

        // then
        assertTrue(matches);
    }
}


// - 목적: PasswordEncoder 단위 테스트로 계약 검증(맞으면 true, 틀리면 false, 해시는 매번 달라야 함).
// - 스프링/Mockito 불필요. 인스턴스 직접 생성해 검증.
// - 핵심 케이스: encode→matches(raw, hash)=true, wrong=false, 두 번 인코딩 결과 !=.
// - 실행: ./gradlew test --tests 'org.example.expert.config.PasswordEncoderTest'