package de.bernhardt.jodev.JustOnDevApplication.calculation.rest;

import de.bernhardt.jodev.JustOnDevApplication.calculation.business.CalculationProcess;
import de.bernhardt.jodev.JustOnDevApplication.calculation.business.CalculationProcessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationRestController implements CalculatorRestApi{

    @Autowired
    private CalculationProcessRepository repo;

    @Override
    public CalculationResponse calculate(@RequestBody CalculationRequest request) {
        CalculationProcess process = this.repo.createProcess(request.getAddress().getValues());
        return new CalculationResponse(process.calculate());
    }
}
