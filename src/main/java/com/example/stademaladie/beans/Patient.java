package com.example.stademaladie.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String nom;
    private String prenom;

    private String dateNaissance;
    private String adresse;
    private String telephone;

    private String genre;
    private double poids;
    private double taille;

    @Lob
    @Column(columnDefinition = "MEDIUMBLOB")
    private String photo;
    @ManyToMany
    @JoinTable(name = "patientMaladie" , joinColumns = @JoinColumn(name = "patient_id"),inverseJoinColumns = @JoinColumn(name = "maladie_id"))
    private List<Maladie> maladies;

    @OneToMany(mappedBy = "patient")
    private List<Detection> detections;


    public Patient() {
    }

    public Patient(int id, String code, String nom, String prenom, String dateNaissance, String adresse, String telephone, double poids, double taille, String photo) {
        this.id = id;
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.telephone = telephone;
        this.poids = poids;
        this.taille = taille;
        this.photo = photo;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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

    public String getPrenom() {
        return prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public double getPoids() {
        return poids;
    }

    public double getTaille() {
        return taille;
    }

    public String getPhoto() {
        return photo;
    }

    public List<Maladie> getMaladies() {
        return maladies;
    }

    @JsonSetter
    public void setMaladies(List<Maladie> maladies) {
        this.maladies = maladies;
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

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public List<Detection> getDetections() {
        return detections;
    }
}
