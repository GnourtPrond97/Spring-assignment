package com.example.assignment_spring.repository;

import com.example.assignment_spring.model.District;
import com.example.assignment_spring.model.Street;
import com.example.assignment_spring.model.StreetDto;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface StreetRepository extends JpaRepository<Street,Integer> {
    Street findByName(String name);
    @Query("select s from  Street s where s.name like %:name% or s.district.id = :districtId " )
    List<Street> searchByDistrictIdAndName(@Param("districtId")Integer districtId , @Param("name") String name);
}
