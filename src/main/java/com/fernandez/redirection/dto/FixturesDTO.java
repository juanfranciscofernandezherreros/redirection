package com.fernandez.redirection.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FixturesDTO {
    @JsonProperty("matchId")
    private String matchId;

    @JsonProperty("eventTime")
    private String eventTime;

    @JsonProperty("homeTeam")
    private String homeTeam;

    @JsonProperty("awayTeam")
    private String awayTeam;

    @JsonProperty("country")
    private String country;

    @JsonProperty("league")
    private String league;

    @JsonProperty("action")
    private String action;

    @JsonProperty("hasExecuted")
    private boolean hasExecuted;
}

