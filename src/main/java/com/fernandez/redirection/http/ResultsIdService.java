package com.fernandez.redirection.http;

import com.fernandez.redirection.dto.ResultsIds;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Service
public class ResultsIdService {

    private final String BASE_URL = "http://localhost:8089/api/npm/resultsId";

    @Autowired
    private RestTemplate restTemplate;

    public ResultsIds getResultsId(String league, String country) {
        String url = String.format("%s/%s/%s", BASE_URL, league, country);

        ResponseEntity<ResultsIds> response = restTemplate.getForEntity(url, ResultsIds.class);
        return response.getBody();
    }
}

