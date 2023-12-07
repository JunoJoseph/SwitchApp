package com.example.SwitchApp.controller;

import com.example.SwitchApp.model.CareerPath;
import com.example.SwitchApp.service.CareerPathService;
import com.example.SwitchApp.service.CareerPathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("career_paths")
public class CareerPathController {

    private final CareerPathService careerPathService;

    @Autowired
    public CareerPathController(CareerPathService careerPathService) {
        this.careerPathService = careerPathService;
    }

//    @GetMapping
//    public ResponseEntity<Object> getAllCareerPaths() {
//        List<CareerPath> careerPaths = careerPathService.getAllCareerPaths();
//        return ResponseEntity.ok(careerPaths);
//    }

    @GetMapping("/getAllPaths")
    public ResponseEntity<List<CareerPath>> getAllCareerPaths() {
        try {
            List<CareerPath> careerPaths = careerPathService.getAllCareerPaths();
            return new ResponseEntity<>(careerPaths, HttpStatus.OK);
        } catch (DataAccessException e) {
            // Log the exception or handle it in some way
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    //{pathID}
//    public ResponseEntity<CareerPath> getAllCareerPathById(@PathVariable int pathID) {
//        CareerPath careerPath = careerPathService.getCareerPathById(pathID);
//        if (careerPath != null) {
//            return ResponseEntity.ok(careerPath);
//        } else {
//            return ResponseEntity.notFound().build();
//        }

        //  public List<Student> getDetails() {
        //        return studentService.getAllDetails();
        //    }
    }
