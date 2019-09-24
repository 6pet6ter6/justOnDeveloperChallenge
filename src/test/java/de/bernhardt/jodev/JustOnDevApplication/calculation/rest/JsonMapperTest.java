package de.bernhardt.jodev.JustOnDevApplication.calculation.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class JsonMapperTest {

    @Value("classpath:request.json")
    private Resource requestResource;

    @Autowired
    private ObjectMapper jsonMapper;

    @Test
    void read() throws IOException {
        CalculationRequest request = this.jsonMapper.readValue(this.requestResource.getInputStream(), CalculationRequest.class);
        assertThat(request).isNotNull();
        assertThat(request.getAddress()).isNotNull();
        assertThat(request.getMeta()).isNotNull();
    }

}
