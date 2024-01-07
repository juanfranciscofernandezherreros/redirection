package com.fernandez.redirection.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultsIds {
    private ResultsIdPKDAO resultsIdPKDAO;
    private Instant dateExecuted;
    private String season;
    private List<String> ids;
}
