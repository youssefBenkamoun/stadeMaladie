package com.example.stademaladie.beans;

import jakarta.persistence.*;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String photo;
    @ManyToOne
    @JoinColumn(name="stade_id")
    private Stade stade;

    public Image() {
    }

    public Image(int id, String code, String photo, Stade stade) {
        this.id = id;
        this.code = code;
        this.photo = photo;
        this.stade = stade;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getPhoto() {
        return photo;
    }

    public Stade getStade() {
        return stade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setStade(Stade stade) {
        this.stade = stade;
    }
}
