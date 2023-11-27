package com.example.SwitchApp.repository;
import com.example.SwitchApp.model.Certification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificationRepository extends JpaRepository<Certification, Integer> {





}
