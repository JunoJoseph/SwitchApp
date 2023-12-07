package com.example.SwitchApp.unit;

import com.example.SwitchApp.model.Certification;
import com.example.SwitchApp.repository.CertificationRepository;
import com.example.SwitchApp.service.CertificationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CertificationServiceUnitTest {

    @InjectMocks
    @Spy
    CertificationService certificationService;

    @Mock
    CertificationRepository certificationRepository;

    @Test
    void testGetAllCertifications() {
        List<Certification> certificationList = List.of(new Certification("CKAD", "Certified kubernetes application developer", "test", "test"));
        Mockito.when((certificationRepository.findAll())).thenReturn(certificationList);

        var result = certificationService.getAllCertifications();
        Assertions.assertEquals(1, result.size());
    }

    @Test
    void testGetAllCertifications2() {
        List<Certification> certificationList = List.of(new Certification("Java SE 8 Programmer", "Certification for proficient Java programming skills", "test", "test"));
        Mockito.when((certificationRepository.findAll())).thenReturn(certificationList);

        var result = certificationService.getAllCertifications();
        Assertions.assertEquals(1, result.size());
    }
}
