package com.example.HospitalSurgery.controller;

import com.example.HospitalSurgery.model.Surgery;
import com.example.HospitalSurgery.repository.SurgeryRepository;
import com.example.HospitalSurgery.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SurgeryController {

    @Autowired
    private SurgeryRepository surgeryRepository;

    @GetMapping("/surgery") // listing all surgeries and the patients in each
    public List<Surgery> getAll(){
        return surgeryRepository.findAll();
    }

    @GetMapping("/surgery/{id}") // Get surgery by id number
    public ResponseEntity<Optional<Surgery>> getSurgery(@PathVariable Long id){
        return new ResponseEntity<>(surgeryRepository.findById(id), HttpStatus.OK);
    }

    

}
