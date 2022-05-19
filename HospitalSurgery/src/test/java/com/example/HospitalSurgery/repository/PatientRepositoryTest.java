package com.example.HospitalSurgery.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientRepositoryTest {

    @Autowired PatientRepository patientRepository;

//    @Test
//    void findPatientLastName_OrderInAlphabeticalOrder(){
//        assertEquals("Addleston", patientRepository.findAllByLastNameORDERED()
//                .get(0).getLastName());
//    }

}