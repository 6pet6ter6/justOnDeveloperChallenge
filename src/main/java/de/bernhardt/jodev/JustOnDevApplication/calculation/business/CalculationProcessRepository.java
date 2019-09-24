package de.bernhardt.jodev.JustOnDevApplication.calculation.business;

import java.util.Collection;

public interface CalculationProcessRepository {

    CalculationProcess createProcess(Collection<Integer> sources);

}
