package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Image;
import com.example.stademaladie.beans.Stade;
import com.example.stademaladie.repositories.ImageRepository;
import com.example.stademaladie.service.ImageService;
import com.example.stademaladie.service.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class ImageController {
    @Autowired
    ImageService imageService ;
    @Autowired
    ImageRepository imageRepository;
    @GetMapping("/stade/{id}")
    public List<Image> findAllByStadeId(@PathVariable(value = "id") int id){
        return imageService.findByStadeId(id);
    }


    @GetMapping("/image/all")
    public List<Image> findAll(){
        return imageRepository.findAll();
    }

    @PostMapping("/image/add")
    public void addImage(@RequestBody Image image){
        imageRepository.save(image);
    }
}
