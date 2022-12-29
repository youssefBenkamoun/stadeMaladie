package com.example.stademaladie.repositories;

import com.example.stademaladie.beans.Detection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetectionRepository extends JpaRepository<Detection,Integer> {
}
