package com.example.HospitalSurgery.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Surgery {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String department;
    @JsonIgnoreProperties({"surgery"})
    @OneToMany(mappedBy = "surgery", cascade = CascadeType.ALL)
    private List<Patient> patients;

    // no arg constructor
    public Surgery() {
    }


    // normal constructor
    public Surgery( String name, String department) {
        this.name = name;
        this.department = department;
        this.patients = new ArrayList<Patient>();

    }



    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        department = department;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
}



