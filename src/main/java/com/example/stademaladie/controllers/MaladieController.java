package com.example.stademaladie.controllers;


import com.example.stademaladie.beans.Maladie;
import com.example.stademaladie.beans.Patient;
import com.example.stademaladie.repositories.MaladieRepository;
import com.example.stademaladie.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/maladie")
public class MaladieController {

    @Autowired
    MaladieRepository maladieRepository;

    @Autowired
    PatientRepository patientRepository;

    @GetMapping("/all")
    public List<Maladie> getAll(@RequestParam int patient){
        Patient patient1 = patientRepository.findById(patient).get();
        System.out.println(patient1.getMaladies());
        return patient1.getMaladies();
    }

    @PostMapping("/add")
    public void addMaladie(@RequestBody Maladie maladie){
        maladieRepository.save(maladie);
    }

}
