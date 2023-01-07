package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Stade;
import com.example.stademaladie.repositories.StadeRepository;
import com.example.stademaladie.service.StadeService;
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

    @GetMapping("/{id}")
    public List<Stade> findAllByMaladieId(@PathVariable(value = "id") int id){
        return stadeService.findByMaladieId(id);
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
