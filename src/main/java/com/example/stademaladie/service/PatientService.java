package com.example.stademaladie.service;


import com.example.stademaladie.beans.Patient;
import com.example.stademaladie.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Patient getPatientById(int id){
        return patientRepository.findById(id).get();
    }


    public void addMaladie(Patient patient){
        patientRepository.save(patient);
    }
}
