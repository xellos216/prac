# Repository Guidelines

## Project Structure & Module Organization
- `src/main/java/org/example/expert`: Spring Boot app code (controllers, services, repositories, entities, config, DTOs).
- `src/main/resources`: application config (e.g., `application.yml`).
- `src/test/java`: JUnit 5 and Mockito tests mirroring main packages.
- `build/`: Gradle build outputs; do not edit.

## Build, Test, and Development Commands
- `./gradlew clean build`: Compiles, runs tests, and produces artifacts.
- `./gradlew test`: Runs unit tests only.
- `./gradlew bootRun`: Starts the API locally (uses H2 runtime by default).
- Run a single test: `./gradlew test --tests 'org.example.expert.domain.comment.service.CommentServiceTest'`.

## Coding Style & Naming Conventions
- Language: Java 17; Spring Boot 3; Lombok is used for boilerplate.
- Indentation: 4 spaces; 120‑col soft limit; meaningful names.
- Packages: `controller`, `service`, `repository`, `entity`, `dto` under feature domains (e.g., `todo`, `comment`).
- DTOs: suffix with `Request`/`Response` and keep immutable where possible.
- Use `@Service`, `@Repository`, `@RestController`, `@RequiredArgsConstructor`; avoid field injection.
- No formatter is enforced; keep imports organized and follow standard Spring idioms.

## Testing Guidelines
- Frameworks: JUnit 5, Mockito; Spring context tests only when needed.
- Location: mirror production package paths under `src/test/java`.
- Naming: `*Test.java`; method names describe behavior (may use Korean as in existing tests).
- Expectations: add unit tests for new logic; cover success and failure paths. Example seed: see `ManagerServiceTest` and `CommentServiceTest`.

## Commit & Pull Request Guidelines
- Commits: small, focused messages in imperative mood (e.g., "Add Manager save validation").
- Reference issues with `#<id>` when applicable. Squash fixups before merge.
- PRs: include purpose, key changes, testing notes, and any API samples (e.g., curl) or screenshots of responses.
- Touch only related modules; keep diffs minimal. Update docs/tests alongside code.

## Security & Configuration Tips
- JWT key: set `jwt.secret.key` in `src/main/resources/application.yml`. Do not commit real secrets for production.
- DB: H2 is available for local runs. To use MySQL, provide `spring.datasource.*` properties in `application.yml`.

## Agent-Specific Instructions
- 언어: 한국어로만 응답합니다.
- 프리앰블: 기본 생략. 필요 시 도구 실행 전 1문장 한국어로만 간단히 알립니다.
- 톤/형식: 간결하고 직설적. 불필요한 설명·장황한 배경은 금지.
- 출력 규칙: 큰 코드/로그는 요청하거나 이해에 필수인 경우만 표시. 변경 요약과 파일 경로를 우선 제공합니다.
- 계획 사용: 다단계 작업에만 `plan`을 사용하고, 단순 질의는 바로 응답합니다.
- 도구 사용: 관련 명령은 묶어서 실행하고, 검색은 `rg` 우선 사용. 소음 많은 출력은 피합니다.
- 보안: 토큰/비밀번호 등 민감정보는 메시지·로그에 마스킹합니다.
