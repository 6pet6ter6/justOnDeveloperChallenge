package de.bernhardt.jodev.JustOnDevApplication.calculation.business;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CalculationProcessRepositoryImpl implements CalculationProcessRepository {

    @Lookup
    public CalculationProcess createProcess(Collection<Integer> sources) {
        return null;
    }

}
