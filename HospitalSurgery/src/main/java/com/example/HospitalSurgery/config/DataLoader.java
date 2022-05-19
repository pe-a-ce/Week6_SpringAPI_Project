package com.example.HospitalSurgery.config;

import com.example.HospitalSurgery.model.Patient;
import com.example.HospitalSurgery.model.Surgery;
import com.example.HospitalSurgery.repository.PatientRepository;
import com.example.HospitalSurgery.repository.SurgeryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
public class DataLoader implements ApplicationRunner {

//    @Autowired
//    PatientRepository patientRepository;

    @Autowired
    SurgeryRepository surgeryRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

//    Surgery Data


        Surgery s1 = new Surgery("Knee Replacement", "Orthopaedics");
        Surgery s2 = new Surgery("Face Lift", "Plastics");
        Surgery s3 = new Surgery("Liposuction", "Plastics");
        Surgery s4 = new Surgery("Appendectomy", "General");
        Surgery s5 = new Surgery("Thrombectomy", "Trauma");
        Surgery s6 = new Surgery("Hernia Repair", "Paediatrics");


        Patient p1 = new Patient("Ralf", "Haddleston", 32, s5);
        Patient p2 = new Patient("Brigg", "Howien", 47, s2);
        Patient p3 = new Patient("Narali", "Stonham", 12, s4);
        Patient p4 = new Patient("Katie", "Plyn", 16, s4);
        Patient p5 = new Patient("Ronny", "Morton", 44, s4);
        Patient p6 = new Patient("Justin", "Seagull", 52, s4);
        Patient p7 = new Patient("Tannie", "Rock", 7, s4);
        Patient p8 = new Patient("moni", "Namu", 68, s4);
        Patient p9 = new Patient("Tasha", "Smyth", 32, s4);
        Patient p10 = new Patient("Cleopatra", "Herald", 92, s4);
        Patient p11 = new Patient("John", "Fisher", 10, s4);
        Patient p12 = new Patient("Obie", "Redwing", 56, s4);
        Patient p13 = new Patient("Tarak", "Partnert", 27, s4);
        Patient p14 = new Patient("Connie", "Mack", 22, s4);
        Patient p15 = new Patient("Jonny", "Jack", 44, s4);

        s4.setPatients(List.of(p1));
    }
}
