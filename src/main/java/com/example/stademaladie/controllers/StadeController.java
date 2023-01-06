package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Stade;
import com.example.stademaladie.service.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class StadeController {
    @Autowired
    StadeService stadeService;
    @GetMapping("/maladie/{id}")
    public List<Stade> findAllByMaladieId(@PathVariable(value = "id") int id){
        return stadeService.findByMaladieId(id);
    }
}
