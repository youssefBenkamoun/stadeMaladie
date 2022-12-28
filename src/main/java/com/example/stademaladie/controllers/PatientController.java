package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Patient;
import com.example.stademaladie.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/all")
    public List<Patient> getAll(){
        return patientRepository.findAll();
    }
}
