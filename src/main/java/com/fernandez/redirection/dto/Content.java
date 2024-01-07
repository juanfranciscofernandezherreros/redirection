
package com.fernandez.redirection.dto;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "country",
    "competition",
    "seasson",
    "hasSummary",
    "hasPlayerStatics",
    "hasStats0",
    "hasStats1",
    "hasStats2",
    "hasStats3",
    "hasStats4",
    "hasStats5",
    "hasLineUps",
    "hasMatchHistory1",
    "hasMatchHistory2",
    "hasMatchHistory3",
    "hasMatchHistory4"
})
@Generated("jsonschema2pojo")
public class Content {

    @JsonProperty("country")
    private String country;
    @JsonProperty("competition")
    private String competition;
    @JsonProperty("seasson")
    private String seasson;
    @JsonProperty("hasSummary")
    private Boolean hasSummary;
    @JsonProperty("hasPlayerStatics")
    private Boolean hasPlayerStatics;
    @JsonProperty("hasStats0")
    private Boolean hasStats0;
    @JsonProperty("hasStats1")
    private Boolean hasStats1;
    @JsonProperty("hasStats2")
    private Boolean hasStats2;
    @JsonProperty("hasStats3")
    private Boolean hasStats3;
    @JsonProperty("hasStats4")
    private Boolean hasStats4;
    @JsonProperty("hasStats5")
    private Boolean hasStats5;
    @JsonProperty("hasLineUps")
    private Boolean hasLineUps;
    @JsonProperty("hasMatchHistory1")
    private Boolean hasMatchHistory1;
    @JsonProperty("hasMatchHistory2")
    private Boolean hasMatchHistory2;
    @JsonProperty("hasMatchHistory3")
    private Boolean hasMatchHistory3;
    @JsonProperty("hasMatchHistory4")
    private Boolean hasMatchHistory4;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("competition")
    public String getCompetition() {
        return competition;
    }

    @JsonProperty("competition")
    public void setCompetition(String competition) {
        this.competition = competition;
    }

    @JsonProperty("seasson")
    public String getSeasson() {
        return seasson;
    }

    @JsonProperty("seasson")
    public void setSeasson(String seasson) {
        this.seasson = seasson;
    }

    @JsonProperty("hasSummary")
    public Boolean getHasSummary() {
        return hasSummary;
    }

    @JsonProperty("hasSummary")
    public void setHasSummary(Boolean hasSummary) {
        this.hasSummary = hasSummary;
    }

    @JsonProperty("hasPlayerStatics")
    public Boolean getHasPlayerStatics() {
        return hasPlayerStatics;
    }

    @JsonProperty("hasPlayerStatics")
    public void setHasPlayerStatics(Boolean hasPlayerStatics) {
        this.hasPlayerStatics = hasPlayerStatics;
    }

    @JsonProperty("hasStats0")
    public Boolean getHasStats0() {
        return hasStats0;
    }

    @JsonProperty("hasStats0")
    public void setHasStats0(Boolean hasStats0) {
        this.hasStats0 = hasStats0;
    }

    @JsonProperty("hasStats1")
    public Boolean getHasStats1() {
        return hasStats1;
    }

    @JsonProperty("hasStats1")
    public void setHasStats1(Boolean hasStats1) {
        this.hasStats1 = hasStats1;
    }

    @JsonProperty("hasStats2")
    public Boolean getHasStats2() {
        return hasStats2;
    }

    @JsonProperty("hasStats2")
    public void setHasStats2(Boolean hasStats2) {
        this.hasStats2 = hasStats2;
    }

    @JsonProperty("hasStats3")
    public Boolean getHasStats3() {
        return hasStats3;
    }

    @JsonProperty("hasStats3")
    public void setHasStats3(Boolean hasStats3) {
        this.hasStats3 = hasStats3;
    }

    @JsonProperty("hasStats4")
    public Boolean getHasStats4() {
        return hasStats4;
    }

    @JsonProperty("hasStats4")
    public void setHasStats4(Boolean hasStats4) {
        this.hasStats4 = hasStats4;
    }

    @JsonProperty("hasStats5")
    public Boolean getHasStats5() {
        return hasStats5;
    }

    @JsonProperty("hasStats5")
    public void setHasStats5(Boolean hasStats5) {
        this.hasStats5 = hasStats5;
    }

    @JsonProperty("hasLineUps")
    public Boolean getHasLineUps() {
        return hasLineUps;
    }

    @JsonProperty("hasLineUps")
    public void setHasLineUps(Boolean hasLineUps) {
        this.hasLineUps = hasLineUps;
    }

    @JsonProperty("hasMatchHistory1")
    public Boolean getHasMatchHistory1() {
        return hasMatchHistory1;
    }

    @JsonProperty("hasMatchHistory1")
    public void setHasMatchHistory1(Boolean hasMatchHistory1) {
        this.hasMatchHistory1 = hasMatchHistory1;
    }

    @JsonProperty("hasMatchHistory2")
    public Boolean getHasMatchHistory2() {
        return hasMatchHistory2;
    }

    @JsonProperty("hasMatchHistory2")
    public void setHasMatchHistory2(Boolean hasMatchHistory2) {
        this.hasMatchHistory2 = hasMatchHistory2;
    }

    @JsonProperty("hasMatchHistory3")
    public Boolean getHasMatchHistory3() {
        return hasMatchHistory3;
    }

    @JsonProperty("hasMatchHistory3")
    public void setHasMatchHistory3(Boolean hasMatchHistory3) {
        this.hasMatchHistory3 = hasMatchHistory3;
    }

    @JsonProperty("hasMatchHistory4")
    public Boolean getHasMatchHistory4() {
        return hasMatchHistory4;
    }

    @JsonProperty("hasMatchHistory4")
    public void setHasMatchHistory4(Boolean hasMatchHistory4) {
        this.hasMatchHistory4 = hasMatchHistory4;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
