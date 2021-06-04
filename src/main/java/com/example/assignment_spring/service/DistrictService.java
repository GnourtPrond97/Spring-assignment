package com.example.assignment_spring.service;

import com.example.assignment_spring.model.District;
import com.example.assignment_spring.model.Street;
import com.example.assignment_spring.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;
    public void create(District district){
        districtRepository.save(district);
    }

    public List<District> getList(){
        return districtRepository.findAll();
    }

    public District findByName(String name){
        return districtRepository.findByName(name);
    }

    public District findById(int id){
        return districtRepository.findById(id);
    }
}
