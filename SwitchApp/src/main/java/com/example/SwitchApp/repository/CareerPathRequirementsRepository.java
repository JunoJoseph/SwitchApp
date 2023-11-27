package com.example.SwitchApp.repository;
import com.example.SwitchApp.model.CareerPathRequirements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CareerPathRequirementsRepository extends JpaRepository<CareerPathRequirements, Integer> {
}
