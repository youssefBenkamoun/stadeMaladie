package com.example.stademaladie.controllers;


import com.example.stademaladie.beans.Maladie;
import com.example.stademaladie.repositories.MaladieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/maladie")
public class MaladieController {

    @Autowired
    MaladieRepository maladieRepository;

    @GetMapping("/all")
    public List<Maladie> getAll(){
        return maladieRepository.findAll();
    }

    @PostMapping("/add")
    public void addMaladie(@RequestBody Maladie maladie){
        maladieRepository.save(maladie);
    }

}
