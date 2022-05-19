package com.example.HospitalSurgery.controller;

import com.example.HospitalSurgery.service.SurgeryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SurgeryController {

    @Autowired
    private SurgeryService surgeryService;
}
