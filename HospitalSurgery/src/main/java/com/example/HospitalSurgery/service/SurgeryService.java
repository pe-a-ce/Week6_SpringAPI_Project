package com.example.HospitalSurgery.service;

import com.example.HospitalSurgery.model.Surgery;
import com.example.HospitalSurgery.repository.SurgeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurgeryService {

    @Autowired
    private static SurgeryRepository surgeryRepository;

    public static List<Surgery> getAll() {
        return surgeryRepository.findAll();
    }

    public static Surgery save(Surgery surgery) {
        return surgeryRepository.save(surgery);
    }

    public static Surgery getSurgery(){
        return surgeryRepository.getById(getSurgery().getId());
    }
}
