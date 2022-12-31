package com.example.stademaladie.repositories;


import com.example.stademaladie.beans.Image;
import com.example.stademaladie.beans.Stade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image,Integer> {
    public List<Image> findByStade_id(int id);

}
