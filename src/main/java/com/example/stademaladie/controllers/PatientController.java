package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Patient;
import com.example.stademaladie.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
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

    @PostMapping( "/add")
    public void addPatient(@RequestParam("fame") String name, @RequestParam("image") MultipartFile image) throws IOException {
        Patient patient = new Patient();
        patient.setNom(name);
        patient.setPhoto("data:image/jpeg;base64,"+ Base64.getEncoder().encodeToString(image.getBytes()));
        System.out.println(name);
        //patientRepository.save(patient);
    }
}
