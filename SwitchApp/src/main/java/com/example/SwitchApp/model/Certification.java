package com.example.SwitchApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "certifications")
public class Certification {

    @Id
    @GeneratedValue
    @Column(name = "certification_id")
    private int certificationID;

    @Column(name = "certification_name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "certification_link")
    private String link;

    @Column(name = "certification_image")
    private String image;

    // Constructors

    public Certification() {
        // Default, no-argument constructor
    }

    public Certification(String name, String description, String link, String image) {
        this.name = name;
        this.description = description;
        this.link = link;
        this.image = image;
    }

    // Getters and Setters

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getLink() { return link; }

    public void setLink(String link) { this.link = link; }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    // toString method (optional)

    @Override
    public String toString() {
        return "Certification{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", link='" + link + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
