package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Stade;
import com.example.stademaladie.service.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class StadeController {
    @Autowired
    StadeService stadeService;
    @GetMapping("/maladie/{id}")
    public List<Stade> findAllByMaladieId(@PathVariable(value = "id") int id){
        return stadeService.findByMaladieId(id);
    }
}
