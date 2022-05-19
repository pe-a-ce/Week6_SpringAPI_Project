package com.example.HospitalSurgery.controller;

import com.example.HospitalSurgery.model.Patient;
import com.example.HospitalSurgery.repository.PatientRepository;
import com.example.HospitalSurgery.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/patients")
    public List<Patient> getAll() {
        return PatientService.getAll();
    }

}