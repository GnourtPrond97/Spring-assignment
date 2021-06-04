package com.example.assignment_spring.service;

import com.example.assignment_spring.model.Street;
import com.example.assignment_spring.repository.StreetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetService {
    @Autowired
    private StreetRepository streetRepository;

    public Street create(Street street){
        return streetRepository.save(street);
    }

    public List<Street> getList(){
        return streetRepository.findAll();
    }

    public Street findByName(String name){
        return  streetRepository.findByName(name);
    }
    public List<Street> findByNameOrDistricId(int districtId, String name){
        return streetRepository.searchByDistrictIdAndName(districtId,name);
    }


}
