package de.bernhardt.jodev.JustOnDevApplication.calculation.business;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculationProcessImplTest {

    @Test
    void calculate() {
        this.assertResult(6, 100, 20, 3);
        this.assertResult(1, 100);
        this.assertResult(18, 100, -1);
        this.assertResult(0, 100, -100);
        this.assertResult(18, 6, 60, 600);
    }

    private  void assertResult(int expected, Integer ... values) {
        CalculationProcessImpl impl = new CalculationProcessImpl(Arrays.asList(values));
        assertThat(impl.calculate()).isEqualTo(expected);
    }

}
