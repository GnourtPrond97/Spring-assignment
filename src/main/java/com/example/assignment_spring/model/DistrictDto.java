package com.example.assignment_spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DistrictDto {
    private int id ;
    private String name ;

    public DistrictDto(District district){
        this.id = district.getId();
        this.name =district.getName();
    }
}
