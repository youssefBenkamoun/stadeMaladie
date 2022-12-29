package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Detection;
import com.example.stademaladie.service.DetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/detection")
public class DetectionController {

    @Autowired
    DetectionService detectionService;

    @PostMapping
    public Detection addDetection(@RequestBody Detection detection){
        return detectionService.addDetection(detection);
    }
}
