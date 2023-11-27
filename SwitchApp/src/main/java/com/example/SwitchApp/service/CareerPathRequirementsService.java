package com.example.SwitchApp.service;
import com.example.SwitchApp.model.CareerPathRequirements;
import com.example.SwitchApp.repository.CareerPathRequirementsRepository;
import java.util.List;

import com.example.SwitchApp.repository.CareerPathRequirementsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CareerPathRequirementsService {

    @Autowired
    private final CareerPathRequirementsRepository careerPathRequirementsRepository; // Inject the CareeerPathRequirementsRepository

    public CareerPathRequirementsService(CareerPathRequirementsRepository careerPathRequirementsRepository) {
        this.careerPathRequirementsRepository = careerPathRequirementsRepository;
    }
       // Get a list of all careerPathRequirements
        public List<CareerPathRequirements> getAllCareerPathRequirements() {
            return careerPathRequirementsRepository.findAll();
        }
}
