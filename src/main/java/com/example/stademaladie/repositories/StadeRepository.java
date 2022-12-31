package com.example.stademaladie.repositories;

import com.example.stademaladie.beans.Stade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StadeRepository extends JpaRepository<Stade,Integer> {
    public List<Stade> findByMaladie_id(int id);
}
