package com.example.assignment_spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Street {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name;
    private long foundingDate;
    private String description;
    private StreetStatus status;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "districtId")
    private District district;

    public enum StreetStatus{
        USING,CONSTRUCTION,REPAIRING
    }

    public static String stringValueOfEnum(StreetStatus status){
        if(status == StreetStatus.USING){
            return "USING";
        }else if(status == StreetStatus.CONSTRUCTION){
            return "CONSTRUCTION";
        } else if(status == StreetStatus.REPAIRING){
            return "REPAIRING";
        }
        return null;
    }

    public static StreetStatus enumValueOfStringStreetStatus(String status){
        if(status.equals("0") ){
            return StreetStatus.USING;
        }else if(status.equals("1") ){
            return StreetStatus.CONSTRUCTION ;
        } else if(status.equals("2") ){
            return  StreetStatus.REPAIRING;
        }
        return null;
    }
}
