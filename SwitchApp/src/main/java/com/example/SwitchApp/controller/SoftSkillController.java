package com.example.SwitchApp.controller;


import com.example.SwitchApp.model.SoftSkill;
import com.example.SwitchApp.service.SoftSkillService;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/soft_skills")
@RequiredArgsConstructor
public class SoftSkillController {


    private final SoftSkillService softSkillService; // Inject the SoftSkillService



    // Display a list of all soft skills
    @GetMapping("/getAllSoftSkills")
    public List<SoftSkill> getAllSoftSkills() {
        List<SoftSkill> softSkills = softSkillService.getAllSoftSkills();
        return softSkills;
    }
}
