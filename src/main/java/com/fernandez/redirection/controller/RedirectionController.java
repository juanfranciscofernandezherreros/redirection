package com.fernandez.redirection.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fernandez.redirection.dto.FixturesDTO;
import com.fernandez.redirection.dto.Root;
import com.fernandez.redirection.http.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/redirection/executeAll")
public class RedirectionController {

    @Autowired
    private UrlService urlService;

    @Autowired
    private BasketballConfigService basketballConfigService;

    @Autowired
    private ResultsIdService resultsIdService;

    @Autowired
    private FixtureService fixtureService;


    @Autowired
    private YourApiService apiService;

    @GetMapping
    @Async
    public ResponseEntity<Void> executeAll(
            @RequestParam(name = "dates", required = false) List<String> dates) {
        // Puedes hacer algo con la lista de fechas, si se proporciona en la solicitud.
        if (dates != null && !dates.isEmpty()) {
            String fixtures = fixtureService.getFixturesSpecificDate(dates);
            System.out.println(fixtures);
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                // Deserializar el array JSON a una lista de FixturesDTO
                List<FixturesDTO> fixturesDTOList = objectMapper.readValue(fixtures, new TypeReference<List<FixturesDTO>>() {
                });
                List<Root> stringList = new ArrayList<>();
                // Puedes iterar sobre la lista y hacer algo con cada FixturesDTO
                for (FixturesDTO fixturesDTO : fixturesDTOList) {
                    Root root = new Root();
                    root.setIds(fixturesDTO.getMatchId());
                    root.setCountry(fixturesDTO.getCountry());
                    root.setLeague(fixturesDTO.getLeague());
                    root.setIds(fixturesDTO.getMatchId());
                    root.setAction("results");
                    stringList.add(root);
                }
                apiService.startNpm(stringList);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        } else {
            String fixtures = fixtureService.getFixtures();
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                // Deserializar el array JSON a una lista de FixturesDTO
                List<FixturesDTO> fixturesDTOList = objectMapper.readValue(fixtures, new TypeReference<List<FixturesDTO>>() {
                });
                List<Root> stringList = new ArrayList<>();
                // Puedes iterar sobre la lista y hacer algo con cada FixturesDTO
                for (FixturesDTO fixturesDTO : fixturesDTOList) {
                    Root root = new Root();
                    root.setIds(fixturesDTO.getMatchId());
                    root.setCountry(fixturesDTO.getCountry());
                    root.setLeague(fixturesDTO.getLeague());
                    root.setIds(fixturesDTO.getMatchId());
                    root.setAction("results");
                    stringList.add(root);
                }
                apiService.startNpm(stringList);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

        }

        return ResponseEntity.ok().build();
    }

}
