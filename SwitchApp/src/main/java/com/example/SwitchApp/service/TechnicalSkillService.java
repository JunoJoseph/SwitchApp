package com.example.SwitchApp.service;

import com.example.SwitchApp.model.TechnicalSkill;
import com.example.SwitchApp.repository.TechnicalSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnicalSkillService {

    @Autowired
    private final TechnicalSkillRepository technicalSkillRepository;

    public TechnicalSkillService(TechnicalSkillRepository technicalSkillRepository) {
        this.technicalSkillRepository = technicalSkillRepository;
    }

    // Get a list of all technical skills
    public List<TechnicalSkill> getAllTechnicalSkills() {
        return technicalSkillRepository.findAll();
    }

}
