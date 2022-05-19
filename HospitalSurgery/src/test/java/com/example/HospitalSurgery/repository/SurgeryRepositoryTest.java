package com.example.HospitalSurgery.repository;

import com.example.HospitalSurgery.model.Surgery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SurgeryRepositoryTest {

    @Autowired
    private SurgeryRepository surgeryRepository;

    @Test
    void findBySurgeryName() {
//        GIVEN
        String KnownName = "Liposuction";
//        WHEN
        Surgery byName = surgeryRepository.findByName(KnownName);
//        THEN
        assertEquals(KnownName, byName.getName());
    }
    @Test
     void findByNonExistingName(){
//        GIVEN
        String UnknownName = "Knee Breaking";
//        WHEN
        Surgery byName = surgeryRepository.findByName(UnknownName);
//        THEN
        assertNull(byName);
        }
    }
