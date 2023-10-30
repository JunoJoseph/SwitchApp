package com.example.SwitchApp.repository;

import com.example.SwitchApp.model.CareerPath;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CareerPathRepository extends JpaRepository<CareerPath,Integer> {

    @Query("SELECT cp FROM CareerPath cp WHERE cp.pathName = : pathName")
    List<CareerPath> findByPathName(@Param("pathName") String pathName);
}
