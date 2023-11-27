package com.example.SwitchApp.service;

import com.example.SwitchApp.model.Certification;
import com.example.SwitchApp.repository.CertificationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificationService {

@Autowired
private final CertificationRepository certificationRepository; // Inject the CertificationRepository

    public CertificationService(CertificationRepository certificationRepository) {
        this.certificationRepository = certificationRepository;
    }
       // Get a list of all certifications
        public List<Certification> getAllCertifications() {
            return certificationRepository.findAll();
        }


}

