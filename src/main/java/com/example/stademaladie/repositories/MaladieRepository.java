package com.example.stademaladie.repositories;

import com.example.stademaladie.beans.Maladie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaladieRepository extends JpaRepository<Maladie,Integer> {
}
