package de.bernhardt.jodev.JustOnDevApplication.calculation.rest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class MetaRequest implements Serializable {

    @JsonProperty("digits")
    private final int digits;

    @JsonProperty("processingPattern")
    private final String processingPattern;

    @JsonCreator
    public MetaRequest(@JsonProperty("digits") int digits,
                @JsonProperty("processingPattern") String processingPattern) {
        this.digits = digits;
        this.processingPattern = processingPattern;
    }

    public int getDigits() {
        return digits;
    }

    public String getProcessingPattern() {
        return processingPattern;
    }
}
