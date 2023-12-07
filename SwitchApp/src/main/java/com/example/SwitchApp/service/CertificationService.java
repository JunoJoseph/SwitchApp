package com.example.SwitchApp.service;

import com.example.SwitchApp.model.Certification;
import com.example.SwitchApp.repository.CertificationRepository;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CertificationService {

private final CertificationRepository certificationRepository; // Inject the CertificationRepository

       // Get a list of all certifications
        public List<Certification> getAllCertifications() {
            return certificationRepository.findAll();
        }


}

