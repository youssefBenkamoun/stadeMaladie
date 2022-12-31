package com.example.stademaladie.repositories;

import com.example.stademaladie.beans.Detection;

import com.example.stademaladie.beans.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DetectionRepository extends JpaRepository<Detection, Integer> {

}

