package com.example.HospitalSurgery.controller;

import com.example.HospitalSurgery.model.Patient;
import com.example.HospitalSurgery.repository.PatientRepository;
import com.example.HospitalSurgery.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.example.HospitalSurgery.service.PatientService.patientRepository;

@RestController // indicates that the class is a controller, and that all the methods in the marked class will return a JSON response.
public class PatientController {



    @Autowired // GLUE
     PatientRepository patientRepository;
// CREATE READ UPDATE DELETE <--> POST READ UPDATE DELETE
// should have the minimum of the following routes: INDEX/SHOW/POST/DELETE

//    SHOW - GET MAPPING
    @GetMapping("/patients") // GET patients
    public List<Patient> getAll() {
        return PatientService.getAll();
    }

//    INDEX - patients by id
    @GetMapping("/patients/{id}") // Get patients by id e.g. localhost:8080/patients
    public ResponseEntity<Optional<Patient>> getPatient(@PathVariable Long id){
        return new ResponseEntity<>(patientRepository.findById(id), HttpStatus.OK);
    }

//    POST (create/save)
    @PostMapping //localhost:8080/patients
    public ResponseEntity<Patient> createPatient(@RequestBody Patient newPatient){
        patientRepository.save(newPatient);
        return new ResponseEntity<>(newPatient, HttpStatus.CREATED);
    }

//    DELETE
    @DeleteMapping("/patients/{id}")
    public void delete(@PathVariable Long id){
    patientRepository.deleteById(id);

}}

