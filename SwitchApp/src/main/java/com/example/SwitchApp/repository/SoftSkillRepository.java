package com.example.SwitchApp.repository;

import com.example.SwitchApp.model.SoftSkill;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SoftSkillRepository extends JpaRepository<SoftSkill, Integer> {

    // Custom query method to find a SoftSkill by its name
    SoftSkill findBySkillName(String skillName);

    // You can add more custom query methods here if needed
}
