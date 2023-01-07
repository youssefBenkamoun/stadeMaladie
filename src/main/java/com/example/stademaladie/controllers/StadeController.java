package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Detection;
import com.example.stademaladie.beans.Maladie;
import com.example.stademaladie.beans.Stade;
import com.example.stademaladie.repositories.MaladieRepository;
import com.example.stademaladie.repositories.StadeRepository;
import com.example.stademaladie.service.StadeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/stade")
@CrossOrigin
@RestController
public class StadeController {
    @Autowired
    StadeService stadeService;
    @Autowired
    StadeRepository stadeRepository;


    @Autowired
    MaladieRepository maladieRepository;
    @GetMapping("/maladie/{id}")
    public List<Stade> findAllByMaladieId(@PathVariable(value = "id") int id){
        return stadeService.findByMaladieId(id);
    }

    @GetMapping("/byMaladiee")
    public List<Stade> getAStades(@RequestParam("id") int id){
        Maladie maladie = maladieRepository.findById(id).get();
        System.out.println(maladie.getStades());
        return maladie.getStades();
    }


    @PostMapping("/stades/add")
    public Stade addStage(@RequestBody Stade stade){
        return stadeRepository.save(stade);
    }

    @PostMapping("/stades/get")
    public Stade getStage(@RequestParam int id){
        return stadeRepository.findById(id).get();
    }

    @GetMapping("/stades/all")
    public List<Stade> findAll(){
        return stadeRepository.findAll();
    }
}
