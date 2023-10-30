package com.example.SwitchApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("career-paths")
public class CareerPathController {

    private final CareerPathService careerPathService;

    @Autowired
    public CareerPathController(CareerPathService careerPathService) {
        this.careerPathService = careerPathService;
    }

    @GetMapping
    public ResponseEntity<List<CareerPath>> getAllCareerPaths() {
        List<CareerPath> careerPaths = careerPathService.getAllCareerPaths();
        return ResponseEntity.ok(careerPaths);
    }

}
