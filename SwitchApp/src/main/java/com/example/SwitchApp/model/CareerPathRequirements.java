package com.example.SwitchApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "career_path_requirements")
public class CareerPathRequirements {

    @Id
    @GeneratedValue
    private int careerPathRequirementsID;

    @Column(name = "career_path_id")
    private int careerPathID;

    @Column(name = "technical_skill_id")
    private int technicalSkillID;

    @Column(name = "certification_id")
    private int certificationID;

   @Column(name = "soft_skill_id")
    private int softSkillID;
    // Constructors

    public CareerPathRequirements() {
        // Default, no-argument constructor
    }

public CareerPathRequirements(int careerPathID, int technicalSkillID, int certificationID, int softSkillID) {
        this.careerPathID = careerPathID;
        this.technicalSkillID = technicalSkillID;
        this.certificationID = certificationID;
        this.softSkillID = softSkillID;
    }

    // Getters and Setters

    public int getCareerPathID() { return careerPathID; }

    public void setCareerPathID(int careerPathID) { this.careerPathID = careerPathID; }

    public int getTechnicalSkillID() { return technicalSkillID; }

    public void setTechnicalSkillID(int technicalSkillID) { this.technicalSkillID = technicalSkillID; }

    public int getCertificationID() { return certificationID; }

    public void setCertificationID(int certificationID) { this.certificationID = certificationID; }

    public int getSoftSkillID() { return softSkillID; }




}

