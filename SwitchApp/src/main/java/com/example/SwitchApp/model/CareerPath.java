package com.example.SwitchApp.model;


import jakarta.persistence.*;

@Entity

@Table(name = "career_paths")
public class CareerPath {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pathid")
    private int pathID;

    @Column(name = "pathname", nullable = false)
    private String pathName;

    @Column(name = "description")
    private String description;




    public CareerPath(int pathID, String pathName, String description) {
        this.pathID = pathID;
        this.pathName = pathName;
        this.description = description;
    }


    public CareerPath() {
        // for persistence
    }

    public int getPathID() {
        return pathID;
    }

    public void setPathID(int pathID) {
        this.pathID = pathID;
    }

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

