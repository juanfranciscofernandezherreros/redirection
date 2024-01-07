package com.fernandez.redirection.http;

import com.fernandez.redirection.dto.DemoBasketballConfig;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BasketballConfigService {

    private static final String BASE_URL = "http://localhost:8999/api/basketball/config";

    private final RestTemplate restTemplate;

    public BasketballConfigService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public DemoBasketballConfig getBasketballConfig(int page, int size) {
        String url = String.format("%s?page=%d&size=%d", BASE_URL, page, size);
        return restTemplate.getForObject(url, DemoBasketballConfig.class);
    }
}
