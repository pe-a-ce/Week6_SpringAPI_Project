package com.example.HospitalSurgery.controller;

import com.example.HospitalSurgery.model.Surgery;
import com.example.HospitalSurgery.repository.SurgeryRepository;
import com.example.HospitalSurgery.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SurgeryController {

    @Autowired
    private SurgeryRepository surgeryRepository;

    @GetMapping("/surgery") // listing all surgeries and the patients in each
    public List<Surgery> getAll(){
        return surgeryRepository.findAll();
    }

    @GetMapping("/surgery")
}
