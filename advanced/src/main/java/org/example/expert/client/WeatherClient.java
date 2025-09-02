package org.example.expert.client;

import org.example.expert.client.dto.WeatherDto;
import org.example.expert.domain.common.exception.ServerException;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

@Component
public class WeatherClient {

    private final RestTemplate restTemplate;

    public WeatherClient(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

// - 가드절 적용: 실패 조건을 먼저 검사하고 즉시 예외 반환
// - 복잡한 if-else 제거로 분기 단순화
// - 상태코드 확인 → 본문 null/empty 확인 → 오늘 데이터 선택 순서

    public String getTodayWeather() {
        ResponseEntity<WeatherDto[]> responseEntity = restTemplate.getForEntity(buildWeatherApiUri(), WeatherDto[].class);
        WeatherDto[] arr = responseEntity.getBody();
        String today = getCurrentDate();

        if (!HttpStatus.OK.equals(responseEntity.getStatusCode()))
            throw new ServerException("날씨 데이터를 가져오는데 실패했습니다. 상태 코드: " + responseEntity.getStatusCode());

        if (arr == null || arr.length == 0) throw new ServerException("날씨 데이터가 없습니다.");
        return Arrays.stream(arr).filter(dto -> today.equals(dto.getDate())).map(WeatherDto::getWeather).findFirst().orElseThrow(()
                -> new ServerException("오늘에 해당하는 날씨 데이터를 찾을 수 없습니다."));
    }

    private URI buildWeatherApiUri() {
        return UriComponentsBuilder
                .fromUriString("https://f-api.github.io")
                .path("/f-api/weather.json")
                .encode()
                .build()
                .toUri();
    }

    private String getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd");
        return LocalDate.now().format(formatter);
    }
}
