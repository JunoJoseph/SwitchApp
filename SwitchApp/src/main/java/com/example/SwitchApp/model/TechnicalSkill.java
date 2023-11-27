package com.example.SwitchApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "technical_skills")
public class TechnicalSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skill_id")
    private int skillID;

    @Column(name = "skill_name")
    private String skillName;

    @Column(name = "description")
    private String description;
    // Constructors


    public TechnicalSkill() {
        // Default, no-argument constructor
    }

    public TechnicalSkill(String skillName) {
        this.skillName = skillName;
    }

    // Getters and Setters

    public int getSkillID() {
        return skillID;
    }

    public void setSkillID(int skillID) {
        this.skillID = skillID;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    // toString method (optional)


    @Override
    public String toString() {
        return "Technical_skill{" +
                "skill_id=" + skillID +
                ", skill_name='" + skillName +
                ", description='" + description + '\'' +
                '}';
    }
}
