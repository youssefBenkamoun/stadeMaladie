package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Patient;
import com.example.stademaladie.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Date;
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
    public void addPatient(@RequestParam("fname") String fname, @RequestParam("lname") String lname, @RequestParam("phone") Long phone, @RequestParam("birth") Date birth, @RequestParam("gender") String gender, @RequestParam("address") String address, @RequestParam("height") double height, @RequestParam("weight") double weight, @RequestParam("image") MultipartFile image) throws IOException {
        Patient patient = new Patient();
        patient.setNom(lname);
        patient.setPrenom(fname);
        patient.setAdresse(address);
        patient.setGenre(gender);
        patient.setTelephone("+212-"+phone);
        patient.setDateNaissance(birth.toString());
        patient.setPoids(weight);
        patient.setTaille(height);
        patient.setPhoto("data:image/jpeg;base64,"+ Base64.getEncoder().encodeToString(image.getBytes()));
        System.out.println(fname);
        System.out.println(image);
        patientRepository.save(patient);
    }
}
