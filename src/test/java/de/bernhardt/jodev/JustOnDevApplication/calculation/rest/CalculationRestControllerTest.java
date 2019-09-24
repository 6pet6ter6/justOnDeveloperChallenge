package de.bernhardt.jodev.JustOnDevApplication.calculation.rest;

import org.assertj.core.api.Assertions;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculationRestControllerTest {

    @LocalServerPort
    private int port;

    @Test
    void calculate() {
        RestTemplate rt = new RestTemplate();

        AddressRequest address = new AddressRequest(Lists.newArrayList("A", "G", "Z"), Lists.newArrayList(6, 60, 600));
        MetaRequest meta = new MetaRequest(33, "d{5}+[a-z&$§]");
        CalculationRequest request = new CalculationRequest(address, meta);
        ResponseEntity<CalculationResponse> responseEntity =
            rt.postForEntity(this.url(), request, CalculationResponse.class);
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody().getResult()).isEqualTo(18);

    }

    private String url() {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("http://localhost:" + this.port)
                                                           .pathSegment("calculate");
        return builder.toUriString();
    }

}
