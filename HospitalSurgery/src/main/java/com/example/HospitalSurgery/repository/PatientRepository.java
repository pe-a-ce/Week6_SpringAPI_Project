package com.example.HospitalSurgery.repository;

import com.example.HospitalSurgery.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {


}
