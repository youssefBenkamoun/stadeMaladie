package com.example.stademaladie.repositories;

import com.example.stademaladie.beans.Maladie;
import com.example.stademaladie.beans.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MaladieRepository extends JpaRepository<Maladie,Integer> {

    public List<Maladie> findByPatients(Patient patient);
}
