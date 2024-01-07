package com.fernandez.redirection.http;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UrlService {

    @Autowired
    private RestTemplate restTemplate;

    public void saveAllUrls() {
        // URL a la que se hará la llamada HTTP
        String apiUrl = "http://localhost:8089/api/npm/saveAllUrls";
        // Realiza la llamada HTTP usando RestTemplate
        ResponseEntity<Void> response = restTemplate.getForEntity(apiUrl, Void.class);
        // Puedes procesar la respuesta si es necesario
        if (response.getStatusCode().is2xxSuccessful()) {
            System.out.println("Llamada HTTP exitosa");
        } else {
            System.out.println("Error en la llamada HTTP: " + response.getStatusCodeValue());
        }
    }
}
