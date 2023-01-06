package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Detection;
import com.example.stademaladie.beans.Maladie;
import com.example.stademaladie.beans.Patient;
import com.example.stademaladie.service.DetectionService;
import com.example.stademaladie.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/detection")
public class DetectionController {

    @Autowired
    DetectionService detectionService;

    @Autowired
    PatientService patientService;

    @PostMapping("/add")
    public Detection addDetection(@RequestBody Detection detection,@RequestBody Maladie maladie){
        System.out.println(detection);
        detection.getPatient().getMaladies().add(maladie);
        patientService.addMaladie(detection.getPatient());
        return detectionService.addDetection(detection);
    }
}
