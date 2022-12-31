package com.example.stademaladie.beans;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Stade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String level;
    private String description;
    @ManyToOne
    @JoinColumn(name = "maladie_id")
    private Maladie maladie;

    @OneToMany(mappedBy = "stade")
    private List<Detection> detection;


    public Stade() {
    }

    public Stade(int id, String code, String level, String description, Maladie maladie) {
        this.id = id;
        this.code = code;
        this.level = level;
        this.description = description;
        this.maladie = maladie;

    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }





    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMaladie(Maladie maladie) {
        this.maladie = maladie;
    }


}
