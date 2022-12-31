package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Patient;
import com.example.stademaladie.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/all")
    public List<Patient> getAll(){
        return patientRepository.findAll();
    }

    @PostMapping("/get")
    public Patient getById(@RequestParam int id){
        return patientRepository.findById(id).get();
    }
}
