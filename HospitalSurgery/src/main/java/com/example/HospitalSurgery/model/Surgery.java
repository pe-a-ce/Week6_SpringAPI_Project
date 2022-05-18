package com.example.HospitalSurgery.model;


import javax.persistence.*;

@Entity
public class Surgery {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Enumerated
    @Column(name="Department")
    private SurgeryEnum Department;

    // no arg constructor
    public Surgery() {}
    // normal constructor
    public Surgery(Long id, String name, SurgeryEnum department) {
        this.id = id;
        this.name = name;
        Department = department;
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

    public SurgeryEnum getDepartment() {
        return Department;
    }

    public void setDepartment(SurgeryEnum department) {
        Department = department;
    }
}
