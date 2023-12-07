package com.example.SwitchApp.integration;

import com.example.SwitchApp.model.Certification;
import com.example.SwitchApp.service.CertificationService;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.List;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.proxy;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CertificationControllerIntegrationTest {

    @LocalServerPort
    int port;

    @MockBean
    CertificationService certificationService;

    @Test
     void testGetAllCertifications() {
        List<Certification> certificationList = List.of(new Certification("CKAD", "Certified kubernetes application developer", "test", "test"));
        Mockito.when((certificationService.getAllCertifications())).thenReturn(certificationList);

        var res = given()
                .log().all()
                .contentType(ContentType.JSON)
                .get("http://localhost:%d/certification/getAllCertifications".formatted(port))
                .then().log().all()
                .extract();

        Assertions.assertEquals(200, res.statusCode());
        Assertions.assertEquals("[CKAD]", res.jsonPath().getString("name"));


    }
}
