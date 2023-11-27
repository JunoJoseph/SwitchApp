package com.example.SwitchApp.controller;

import com.example.SwitchApp.model.Certification;
import java.util.List;
import com.example.SwitchApp.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/certification")
public class CertificationController {

    @Autowired
    private CertificationService certificationService; // Inject the CertificationService

    // Display a list of all certifications
    @GetMapping("/getAllCertifications")
    public List<Certification> getAllCertifications() {
        List<Certification> certifications = certificationService.getAllCertifications();
        return certifications;
    }

}
