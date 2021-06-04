package com.example.assignment_spring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name ;

    @OneToMany(mappedBy = "district",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<Street> streetSet;
}
