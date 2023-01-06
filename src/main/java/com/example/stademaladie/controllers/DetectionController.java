package com.example.stademaladie.controllers;

import com.example.stademaladie.beans.Detection;
import com.example.stademaladie.beans.Maladie;
import com.example.stademaladie.beans.Patient;
import com.example.stademaladie.repositories.PatientRepository;
import com.example.stademaladie.service.DetectionService;
import com.example.stademaladie.service.PatientService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/detection")
public class DetectionController {

    @Autowired
    DetectionService detectionService;

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    PatientService patientService;

    @PostMapping("/add")
    public Detection addDetection(@RequestBody HashMap map) {
        final ObjectMapper mapper = new ObjectMapper();
        final Detection detection = mapper.convertValue(map.get(("detection")), Detection.class);
        final Maladie maladie = mapper.convertValue(map.get("maladie"), Maladie.class);
        System.out.println(detection);
        Patient p = patientService.getPatientById(detection.getPatient().getId());
        List<Maladie> list = p.getMaladies();
        detection.setDate(new Date());
        list.add(maladie);
        System.out.println(list);
        p.setMaladies(list);
        patientRepository.save(p);
        return detectionService.addDetection(detection);
    }
}
