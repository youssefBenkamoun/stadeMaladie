package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Image;
import com.example.stademaladie.beans.Stade;
import com.example.stademaladie.service.ImageService;
import com.example.stademaladie.service.StadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/image")
@CrossOrigin
@RestController
public class ImageController {
    @Autowired
    ImageService imageService ;
    @GetMapping("/{id}")
    public List<Image> findAllByStadeId(@PathVariable(value = "id") int id){
        return imageService.findByStadeId(id);
    }
}
