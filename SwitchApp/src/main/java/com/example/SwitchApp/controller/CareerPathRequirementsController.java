package com.example.SwitchApp.controller;
import com.example.SwitchApp.model.CareerPathRequirements;
import com.example.SwitchApp.service.CareerPathRequirementsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/careerPathRequirements")
@RequiredArgsConstructor
public class CareerPathRequirementsController {

    private CareerPathRequirementsService careerPathRequirementsService; // Inject the careerPathRequirementsService

    // Display a list of all careerPathRequirements
    @GetMapping("/getAllCareerPathRequirements")
    public List<CareerPathRequirements> getAllCareerPathRequirements() {
        List<CareerPathRequirements> careerPathRequirements = careerPathRequirementsService.getAllCareerPathRequirements();
        return careerPathRequirements;
    }

}


