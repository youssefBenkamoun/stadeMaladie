package com.example.stademaladie.repositories;

import com.example.stademaladie.beans.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer> {
}
