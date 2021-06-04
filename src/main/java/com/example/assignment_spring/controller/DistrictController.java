package com.example.assignment_spring.controller;

import com.example.assignment_spring.model.District;
import com.example.assignment_spring.model.DistrictDto;
import com.example.assignment_spring.model.Street;
import com.example.assignment_spring.model.StreetDto;
import com.example.assignment_spring.repository.DistrictRepository;
import com.example.assignment_spring.service.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/district")
public class DistrictController {
    @Autowired
    private DistrictRepository districtRepository;
    @Autowired
    private DistrictService districtService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<DistrictDto> getAll(){
        List<District> list = districtService.getList();
        return list.stream().map(d -> new DistrictDto(d)).collect(Collectors.toList());
    }
}
