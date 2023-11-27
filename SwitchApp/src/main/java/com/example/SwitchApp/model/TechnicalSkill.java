package com.example.SwitchApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Technical_Skills")
public class TechnicalSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Technical-skillid")
    private int skillID;

    @Column(name = "Technical-skillname")
    private String skillName;

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

    // toString method (optional)


    @Override
    public String toString() {
        return "Technical_skill{" +
                "skillid=" + skillID +
                ", skillname='" + skillName + '\'' +
                '}';
    }
}
