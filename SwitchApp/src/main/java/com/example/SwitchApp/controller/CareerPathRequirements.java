package com.example.SwitchApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/careerPathRequirements")
public class CareerPathRequirements {

    @Autowired
    private careerPathRequirementsService careerPathRequirementsService; // Inject the careerPathRequirementsService

    // Display a list of all careerPathRequirements
    @GetMapping("/getAllCareerPathRequirements")
    public List<careerPathRequirements> getAllCareerPathRequirements() {
        List<careerPathRequirements> careerPathRequirements = careerPathRequirementsService.getAllCareerPathRequirements();
        return careerPathRequirements;
    }


}


