package de.bernhardt.jodev.JustOnDevApplication.calculation.business;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CalculationProcessImpl implements CalculationProcess {

    private final Collection<Integer> sources;

    CalculationProcessImpl(Collection<Integer> sources) {
        this.sources = sources;
    }

    @Override
    public int calculate() {
        int sum = this.sources.stream().mapToInt(Integer::intValue).sum();
        return digitSum(sum);
    }

    int digitSum(int n){
        return n >= 10 ? n % 10 + digitSum(n / 10) : n;
    }
}
