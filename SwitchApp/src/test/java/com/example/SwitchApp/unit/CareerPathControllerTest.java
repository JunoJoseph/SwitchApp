package com.example.SwitchApp.unit;

import com.example.SwitchApp.controller.CareerPathController;
import com.example.SwitchApp.model.CareerPath;
import com.example.SwitchApp.service.CareerPathService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

public class CareerPathControllerTest {

    @Mock
    private CareerPathService careerPathService;

    @InjectMocks
    private CareerPathController careerPathController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this); // Initialize mocks
    }

    @Test
    void testGetAllCareerPathsSuccess() {
        // Arrange
        List<CareerPath> mockCareerPaths = List.of(
                new CareerPath(1, "Path 1", "Description 1"),
                new CareerPath(2, "Path 2", "Description 2")
        );
        when(careerPathService.getAllCareerPaths()).thenReturn(mockCareerPaths);

        // Act
        ResponseEntity<List<CareerPath>> responseEntity = careerPathController.getAllCareerPaths();

        // Assert
        assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseEntity.getBody()).isEqualTo(mockCareerPaths);
        verify(careerPathService, times(1)).getAllCareerPaths();
    }

    @Test
    void testGetAllCareerPathsException() {
        // Arrange
        when(careerPathService.getAllCareerPaths()).thenThrow(new RuntimeException("An error occurred"));

        // Act and Assert
        assertThrows(RuntimeException.class, () -> {
            careerPathController.getAllCareerPaths();
        });
    }
}