package com.example.SwitchApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "soft_skills")
public class SoftSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "skillid")
    private int skillID;

    @Column(name = "skillname")
    private String skillName;

    // Constructors

    public SoftSkill() {
        // Default, no-argument constructor
    }

    public SoftSkill(String skillName) {
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
        return "soft_skill{" +
                "skillid=" + skillID +
                ", skillname='" + skillName + '\'' +
                '}';
    }
}
