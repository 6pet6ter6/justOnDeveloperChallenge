package de.bernhardt.jodev.JustOnDevApplication.calculation.business;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CalculationProcessRepositoryTest {

    @Autowired
    private CalculationProcessRepositoryImpl repo;

    @Test
    void createProcess() {
        CalculationProcess process = this.repo.createProcess(Lists.newArrayList(1, 2, 3));
        assertThat(process).isNotNull();
    }

}
