package com.example.SwitchApp.service;


import com.example.SwitchApp.model.SoftSkill;
import com.example.SwitchApp.repository.SoftSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftSkillService {

    @Autowired
    private final SoftSkillRepository softSkillRepository;

    public SoftSkillService(SoftSkillRepository softSkillRepository) {
        this.softSkillRepository = softSkillRepository;
    }

    // Get a list of all soft skills
    public List<SoftSkill> getAllSoftSkills() {
        return softSkillRepository.findAll();
    }
}