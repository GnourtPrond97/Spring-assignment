package com.example.assignment_spring.repository;

import com.example.assignment_spring.model.District;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DistrictRepository extends JpaRepository<District,Integer> {
     District findByName(String name);
     District findById(int id);
}
