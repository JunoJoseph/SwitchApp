package com.example.SwitchApp.integration;

import com.example.SwitchApp.model.SoftSkill;
import com.example.SwitchApp.service.SoftSkillService;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.server.LocalServerPort;

import java.util.List;

import static io.restassured.RestAssured.given;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SoftSkillControllerIntegrationTest {

    @LocalServerPort
    int port;

    @MockBean
    SoftSkillService softSkillService;

    @Test
    void testGetAllSoftSkills() {
        // Arrange
        List<SoftSkill> softSkillList = List.of(new SoftSkill("Communication", "test", "test"));
        Mockito.when(softSkillService.getAllSoftSkills()).thenReturn(softSkillList);

        // Act and Assert
      var res = given()
                .log().all()
                .contentType(ContentType.JSON)
                .when()
                .get("http://localhost:%d/soft_skills/getAllSoftSkills".formatted(port))
                .then().log().all()
                .extract();

        Assertions.assertEquals(200, res.statusCode());
        Assertions.assertEquals("[null]", res.jsonPath().getString("name"));
    }

}
