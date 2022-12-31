package com.example.stademaladie.beans;

import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Detection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String photo;
    private String code;
    private boolean validation;
    private Date date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "stade_id")
    private Stade stade;

    public Detection() {
    }

    public Detection(int id, String photo, String code, boolean validatio, Date date, String description, Patient patient, Stade stade) {
        this.id = id;
        this.photo = photo;
        this.code = code;
        this.validation = validation;
        this.stade = stade;
        this.date = date;
        this.description = description;
        this.patient = patient;

    }

    public int getId() {
        return id;
    }

    public String getPhoto() {
        return photo;
    }

    public String getCode() {
        return code;
    }

    public boolean isValidation() {
        return validation;
    }

    public Stade getStade() {
        return stade;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    public void setStade(Stade stade) {
        this.stade = stade;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


}
