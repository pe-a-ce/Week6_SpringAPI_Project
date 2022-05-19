package com.example.HospitalSurgery.service;

import com.example.HospitalSurgery.model.Patient;
import com.example.HospitalSurgery.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    public static PatientRepository patientRepository;

    public static List<Patient> getAll(){
        return patientRepository.findAll();
    }

    public static Patient save(Patient patient) {return patientRepository.save(patient);}

    public Patient getPatient() {
        return  patientRepository.getById(getPatient().getId());
    }
}
