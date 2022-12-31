package com.example.stademaladie.service;

import com.example.stademaladie.beans.Stade;
import com.example.stademaladie.repositories.StadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StadeService {
    @Autowired
    StadeRepository stadeRepository;

    public List<Stade> findByMaladieId(int id){
        return stadeRepository.findByMaladie_id(id);
    }

}
