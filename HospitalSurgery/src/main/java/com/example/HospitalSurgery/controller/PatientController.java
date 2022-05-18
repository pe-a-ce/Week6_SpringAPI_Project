package com.example.HospitalSurgery.controller;

import com.example.HospitalSurgery.model.Patient;
import com.example.HospitalSurgery.repository.PatientRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {

    private final PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository){this.patientRepository = patientRepository;}

    @GetMapping("/patients")
    public ResponseEntity<List<Patient>> getAllSurgeries(){
        List<Patient> patients = patientRepository.findAll();
        return ResponseEntity
                .ok()
                .body(patients);
    }

    @PostMapping("/patients")
    public ResponseEntity<Patient> createSurgery(@RequestBody Patient patient){
        Patient result = patientRepository.save(patient);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @GetMapping("/patients_1")
    public ResponseEntity<List<Patient>> getAllPatients(@RequestParam(required = false, defaultValue = "false") boolean orderedByAge){

        List<Patient> patients;
        if (orderedByAge){
            patients = patientRepository.findAllByAge();
        } else {
            patients = patientRepository.findAll();
        }
            return ResponseEntity
                    .ok()
                    .body(patients);
    }
}

