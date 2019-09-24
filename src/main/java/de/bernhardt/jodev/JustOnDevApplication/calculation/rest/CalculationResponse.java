package de.bernhardt.jodev.JustOnDevApplication.calculation.rest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CalculationResponse {

    @JsonProperty("result")
    private final int result;

    CalculationResponse(@JsonProperty("result") int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }
}
