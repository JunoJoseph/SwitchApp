package com.example.SwitchApp.service;

import com.example.SwitchApp.model.CareerPath;
import com.example.SwitchApp.repository.CareerPathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CareerPathService {

    private final CareerPathRepository careerPathRepository;

    @Autowired
    public CareerPathService(CareerPathRepository careerPathRepository) {
        this.careerPathRepository = careerPathRepository;
    }


    public CareerPath getCareerPathById(int pathID) {
        return careerPathRepository.findById(pathID).orElse(null);
    }


    public List<CareerPath> getAllCareerPaths() {
        return careerPathRepository.findAll();
    }



}
