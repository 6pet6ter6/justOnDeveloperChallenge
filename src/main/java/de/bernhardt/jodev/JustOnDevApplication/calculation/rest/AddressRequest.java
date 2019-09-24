package de.bernhardt.jodev.JustOnDevApplication.calculation.rest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class AddressRequest implements Serializable {

    @JsonProperty("colorKeys")
    private final List<String> colorKeys;

    @JsonProperty("values")
    private final List<Integer> values;

    @JsonCreator
    public AddressRequest(@JsonProperty("colorKeys") List<String> colorKeys,
                   @JsonProperty("values") List<Integer> values) {
        this.colorKeys = colorKeys;
        this.values = values;
    }

    public List<Integer> getValues() {
        return values;
    }

    public List<String> getColorKeys() {
        return colorKeys;
    }
}
