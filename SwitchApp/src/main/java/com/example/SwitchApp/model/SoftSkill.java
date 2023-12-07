package com.example.SwitchApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "soft_skills")
@Getter
@Setter
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

    public SoftSkill(String communication, String test, String test1) {
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
