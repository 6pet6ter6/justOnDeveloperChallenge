package de.bernhardt.jodev.JustOnDevApplication.calculation.rest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CalculationRequest implements Serializable {

    @JsonProperty("meta")
    private final MetaRequest meta;

    @JsonProperty("address")
    private final AddressRequest address;

    @JsonCreator
    public CalculationRequest(@JsonProperty("address") AddressRequest address,
                       @JsonProperty("meta") MetaRequest meta) {
        this.address = address;
        this.meta = meta;
    }

    public AddressRequest getAddress() {
        return address;
    }

    public MetaRequest getMeta() {
        return meta;
    }
}
