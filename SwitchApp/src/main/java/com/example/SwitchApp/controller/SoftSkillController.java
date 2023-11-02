package com.example.SwitchApp.controller;

import com.example.SwitchApp.model.CareerPath;
import com.example.SwitchApp.model.SoftSkill;
import com.example.SwitchApp.service.SoftSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/soft_skills")
public class SoftSkillController {

    @Autowired
    private SoftSkillService softSkillService; // Inject the SoftSkillService

    // Display a list of all soft skills
    @GetMapping("/getAllSoftSkills")
    public List<SoftSkill> getAllSoftSkills() {
        List<SoftSkill> softSkills = softSkillService.getAllSoftSkills();
        return softSkills;
    }
}
