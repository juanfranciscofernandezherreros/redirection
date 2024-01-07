package com.fernandez.redirection.http;

import com.fernandez.redirection.dto.Root;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class YourApiService {

    private String apiUrl = "http://localhost:8089/api/npm/start";

    public void startNpm(List<Root> roots) {
        // Configura las cabeceras de la solicitud
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        // Crea una entidad HTTP con la lista de roots y las cabeceras
        HttpEntity<List<Root>> requestEntity = new HttpEntity<>(roots, headers);

        // Crea un objeto RestTemplate
        RestTemplate restTemplate = new RestTemplate();

        // Realiza la solicitud POST
        ResponseEntity<Void> responseEntity = restTemplate.postForEntity(apiUrl, requestEntity, Void.class);

        // Puedes manejar la respuesta según sea necesario
        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            System.out.println("Solicitud exitosa");
        } else {
            System.err.println("Error en la solicitud");
        }
    }
}
