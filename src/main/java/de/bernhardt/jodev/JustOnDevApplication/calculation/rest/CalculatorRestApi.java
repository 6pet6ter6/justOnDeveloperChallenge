package de.bernhardt.jodev.JustOnDevApplication.calculation.rest;

import org.springframework.web.bind.annotation.PostMapping;

public interface CalculatorRestApi {

    @PostMapping("/calculate")
    CalculationResponse calculate(CalculationRequest request);

}
