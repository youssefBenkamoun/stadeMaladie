package com.example.stademaladie.beans;


import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("medcin")
public class Medcin extends User{

    private String licence;



    public Medcin(String nom, String prenom, String gender, String number, String email, String password, String licence) {
        super(nom, prenom, gender, number, email, password);
        this.licence = licence;
    }

    public Medcin() {
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }
}
