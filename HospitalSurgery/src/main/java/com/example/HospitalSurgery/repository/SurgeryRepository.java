package com.example.HospitalSurgery.repository;

import com.example.HospitalSurgery.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryRepository extends JpaRepository<Surgery, Long> {

//    nameGeneratesQuery
//           1. Can only use findBy[ExistingFieldName]
    Surgery findByName(String name);
}
