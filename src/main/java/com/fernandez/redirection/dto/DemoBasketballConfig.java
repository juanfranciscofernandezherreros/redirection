
package com.fernandez.redirection.dto;

import java.util.LinkedHashMap;
import java.util.List;
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
    "content",
    "pageable",
    "last",
    "totalElements",
    "totalPages",
    "size",
    "number",
    "sort",
    "first",
    "numberOfElements",
    "empty"
})
@Generated("jsonschema2pojo")
public class DemoBasketballConfig {

    @JsonProperty("content")
    private List<Content> content;
    @JsonProperty("pageable")
    private Pageable pageable;
    @JsonProperty("last")
    private Boolean last;
    @JsonProperty("totalElements")
    private Integer totalElements;
    @JsonProperty("totalPages")
    private Integer totalPages;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("sort")
    private Sort__1 sort;
    @JsonProperty("first")
    private Boolean first;
    @JsonProperty("numberOfElements")
    private Integer numberOfElements;
    @JsonProperty("empty")
    private Boolean empty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("content")
    public List<Content> getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(List<Content> content) {
        this.content = content;
    }

    @JsonProperty("pageable")
    public Pageable getPageable() {
        return pageable;
    }

    @JsonProperty("pageable")
    public void setPageable(Pageable pageable) {
        this.pageable = pageable;
    }

    @JsonProperty("last")
    public Boolean getLast() {
        return last;
    }

    @JsonProperty("last")
    public void setLast(Boolean last) {
        this.last = last;
    }

    @JsonProperty("totalElements")
    public Integer getTotalElements() {
        return totalElements;
    }

    @JsonProperty("totalElements")
    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    @JsonProperty("totalPages")
    public Integer getTotalPages() {
        return totalPages;
    }

    @JsonProperty("totalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("sort")
    public Sort__1 getSort() {
        return sort;
    }

    @JsonProperty("sort")
    public void setSort(Sort__1 sort) {
        this.sort = sort;
    }

    @JsonProperty("first")
    public Boolean getFirst() {
        return first;
    }

    @JsonProperty("first")
    public void setFirst(Boolean first) {
        this.first = first;
    }

    @JsonProperty("numberOfElements")
    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    @JsonProperty("numberOfElements")
    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    @JsonProperty("empty")
    public Boolean getEmpty() {
        return empty;
    }

    @JsonProperty("empty")
    public void setEmpty(Boolean empty) {
        this.empty = empty;
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
