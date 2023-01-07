package com.example.stademaladie.service;

import com.example.stademaladie.beans.Maladie;
import com.example.stademaladie.beans.Patient;
import com.example.stademaladie.repositories.MaladieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaladieService {
    @Autowired
    MaladieRepository maladieRepository;

    public List<Maladie> getAll(){
        return maladieRepository.findAll();
    }
    public List<Maladie> getAllByPatient(Patient patient){
        return maladieRepository.findByPatients(patient);
    }
}
