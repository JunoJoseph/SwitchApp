package com.example.SwitchApp.repository;

import com.example.SwitchApp.model.TechnicalSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalSkillRepository extends JpaRepository<TechnicalSkill, Integer> {
    TechnicalSkill findBySkillName(String skillName); // Custom query method to find a TechnicalSkill by its name





}
