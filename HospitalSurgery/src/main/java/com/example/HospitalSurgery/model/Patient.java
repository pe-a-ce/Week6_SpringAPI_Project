package com.example.HospitalSurgery.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    @ManyToMany(mappedBy = "patients") // mapped by = name of the property in 'Patient' that's to be FK
    @JsonIgnoreProperties(value = {"patients"})
    private List<Surgery> surgeries; // list of surgeries that a patient is going to have

    public Patient() {} // no  arg constructor to satisfy Spring

    //normal constructors
    public Patient(Long id, String firstName, String lastName, int age, List<Surgery> surgeries) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.surgeries = surgeries;
    }

        // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Surgery> getSurgeries() {
        return surgeries;
    }

    public void setSurgeries(List<Surgery> surgeries) {
        this.surgeries = surgeries;
    }
}
