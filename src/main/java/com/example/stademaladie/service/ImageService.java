package com.example.stademaladie.service;

import com.example.stademaladie.beans.Image;
import com.example.stademaladie.beans.Stade;
import com.example.stademaladie.repositories.ImageRepository;
import com.example.stademaladie.repositories.StadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ImageService {
    @Autowired
    ImageRepository imageRepository;

    public List<Image> findByStadeId(int id){
        return imageRepository.findByStade_id(id);
    }
}
