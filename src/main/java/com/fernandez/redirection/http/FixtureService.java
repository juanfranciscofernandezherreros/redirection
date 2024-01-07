package com.fernandez.redirection.http;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class FixtureService {

    private String apiUrl="http://localhost:8099/api/fixtures?yesterday";

    private String apiUrlDates="http://localhost:8099/api/fixtures?dates=2024-01-05,2023-12-24,2024-01-02";

    private final RestTemplate restTemplate;

    public FixtureService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getFixturesSpecificDate(List<String> localDates){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        ResponseEntity<String> responseEntity = restTemplate.exchange(
                apiUrlDates,
                HttpMethod.GET,
                null,
                String.class
        );
        return responseEntity.getBody();
    }
    public String getFixtures() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);

        ResponseEntity<String> responseEntity = restTemplate.exchange(
                apiUrl,
                HttpMethod.GET,
                null,
                String.class
        );

        return responseEntity.getBody();
    }

}

