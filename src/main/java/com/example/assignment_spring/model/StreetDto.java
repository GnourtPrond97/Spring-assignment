package com.example.assignment_spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StreetDto {
    private String id ;
    private String name;
    private String foundingDate;
    private String description;
    private String status;
    private String districtId;
    private String districtName;

    public StreetDto(Street street){
        this.id = String.valueOf(street.getId());
        this.name = street.getName();
        this.foundingDate = String.valueOf(street.getFoundingDate());
        this.description = street.getDescription();
        this.status = Street.stringValueOfEnum(street.getStatus());
        this.districtId = String.valueOf(street.getDistrict().getId());
        this.districtName = String.valueOf(street.getDistrict().getName());
    }

    public StreetDto(String name, String foundingDate, String description, String status, String districtId) {
        this.name = name;
        this.foundingDate = foundingDate;
        this.description = description;
        this.status = status;
        this.districtId = districtId;
    }
}
