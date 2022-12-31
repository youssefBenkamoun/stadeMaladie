package com.example.stademaladie.service;

import com.example.stademaladie.beans.Detection;
import com.example.stademaladie.repositories.DetectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class DetectionService {

    @Autowired
    DetectionRepository detectionRepository;

    public Detection addDetection(Detection detection){
        return detectionRepository.save(detection);
    }
}
