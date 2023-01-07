package com.example.stademaladie.controllers;


import com.example.stademaladie.beans.Maladie;
import com.example.stademaladie.beans.Patient;
import com.example.stademaladie.repositories.MaladieRepository;
import com.example.stademaladie.repositories.PatientRepository;
import com.example.stademaladie.service.MaladieService;
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
    MaladieService maladieService;

    @Autowired
    PatientRepository patientRepository;


    @GetMapping("/alla")
    public List<Maladie> getaAll(@RequestParam int patient){
        Patient patient1 = patientRepository.findById(patient).get();
        System.out.println(patient1.getMaladies());
        return patient1.getMaladies();
    }
    @GetMapping("/{id}")
    public List<Maladie> getAllByPatient(@PathVariable int id){
        Patient patient = patientRepository.findById(id).get();
        return maladieService.getAllByPatient(patient);
    }

    @PostMapping("/get")
    public Maladie getById(@RequestParam int id){
        System.out.println(maladieRepository.findById(id).get().getCode());
        return maladieRepository.findById(id).get();
    }

    @PostMapping("/add")
    public void addMaladie(@RequestBody Maladie maladie){
        maladieRepository.save(maladie);
    }

}
