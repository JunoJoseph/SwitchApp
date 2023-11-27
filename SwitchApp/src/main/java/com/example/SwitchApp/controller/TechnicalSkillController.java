package com.example.SwitchApp.controller;

import java.util.List;

import com.example.SwitchApp.model.TechnicalSkill;
import com.example.SwitchApp.service.TechnicalSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/technical_skills")    // This means URL's start with /technical_skills (after Application path)
public class TechnicalSkillController {

    @Autowired
    private TechnicalSkillService technicalSkillService; // Inject the TechnicalSkillsService

    @GetMapping("/getAllTechnicalSkills") // Map ONLY GET Requests
    public List<TechnicalSkill> getAllTechnicalSkills() {
        List<TechnicalSkill> technicalSkills = technicalSkillService.getAllTechnicalSkills();
        return technicalSkills;
    }
}
