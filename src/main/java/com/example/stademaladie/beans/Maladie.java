package com.example.stademaladie.beans;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Maladie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String nom;
    @ManyToMany
    @JoinTable(name = "patientMaladie" , joinColumns = @JoinColumn(name = "patient_id"),inverseJoinColumns = @JoinColumn(name = "maladie_id"))
    private List<Patient> patients;
    public Maladie() {
    }

    public Maladie(int id, String code, String nom) {
        this.id = id;
        this.code = code;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
