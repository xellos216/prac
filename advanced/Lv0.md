# gwt\_fix\_summary

**Given**

* 부트 실행 실패. `UnsatisfiedDependencyException(filterConfig → jwtUtil)`.
* `JwtUtil`이 `@Value("${jwt.secret.key}")` 필요. `application.yml` 없음.

**When**

* `src/main/resources/application.yml` 생성. `jwt.secret.key`에 Base64 32B 값 추가.
* `JwtUtil`은 `@Component` 유지. `@PostConstruct`에서 키 초기화.
* 재실행 시 2차 에러 `Failed to configure a DataSource`. `build.gradle`에 H2 추가.

**Then**

* `jwtUtil` 빈 생성 성공.
* 데이터소스 자동설정 충족.
* 애플리케이션 정상 기동.

# gwt\_fix\_detailed

## 1) Theory

* 원인 1: 프로퍼티 미존재로 `@Value("${jwt.secret.key}")` 해석 실패 → `jwtUtil` 생성 실패 → `filterConfig` 주입 실패.
* 원인 2: JDBC 드라이버 부재로 `DataSourceAutoConfiguration` 실패.
* 조치: `application.yml`에 키 추가, H2 의존성 추가. 디버깅은 `--debug`와 `logging.level`로 원인 추적.

## 2) Example code

```java
// JwtUtil.java
@Component
public class JwtUtil {
    @Value("${jwt.secret.key}")
    private String secret; // Base64 32B+

    private java.security.Key key;

    @jakarta.annotation.PostConstruct
    public void init() {
        byte[] bytes = io.jsonwebtoken.io.Decoders.BASE64.decode(secret);
        this.key = io.jsonwebtoken.security.Keys.hmacShaKeyFor(bytes); // HS256
    }
}
```

```java
// FilterConfig.java (주입만 확인)
@org.springframework.context.annotation.Configuration
@lombok.RequiredArgsConstructor
public class FilterConfig {
    private final JwtUtil jwtUtil;
    private final com.fasterxml.jackson.databind.ObjectMapper objectMapper;
}
```

```yaml
# src/main/resources/application.yml
debug: true

jwt:
  secret:
    key: "BASE64_32B_OR_MORE"

logging:
  level:
    org.springframework.beans.factory: DEBUG
```

```groovy
// build.gradle
dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'com.h2database:h2'
}
```

## 3) Execution and testing method

```bash
# 키 생성
openssl rand -base64 32

# 리소스 포함 확인
./gradlew clean processResources && ls build/resources/main

# 디버그 실행(원인 추적)
./gradlew bootRun -Dspring-boot.run.arguments=--debug --stacktrace \
  2>&1 | grep -E "Caused by:|Exception|ERROR" -n

# 정상 기동 확인
./gradlew bootRun
```
