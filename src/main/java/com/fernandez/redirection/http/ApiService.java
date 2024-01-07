package com.fernandez.redirection.http;

import com.fernandez.redirection.dto.Root;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ApiService {

    public void makePostRequest(String country, String league, String action) {
        String url = "http://localhost:8089/api/npm/strings";

        // Construir el cuerpo de la solicitud
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String jsonBody = String.format("{\"country\":\"%s\",\"league\":\"%s\",\"action\":\"%s\"}", country, league, action);

        HttpEntity<String> requestEntity = new HttpEntity<>(jsonBody, headers);

        // Realizar la llamada POST
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, requestEntity, String.class);

        // Manejar la respuesta si es necesario
        String responseBody = responseEntity.getBody();
        System.out.println("Respuesta: " + responseBody);
    }

    public void setRootList(List<Root> stringList) {
    }
}

