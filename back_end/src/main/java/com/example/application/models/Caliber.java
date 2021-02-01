package com.example.application.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "calibers")
public class Caliber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties("caliber")
    @OneToMany(mappedBy = "caliber")
    private List<AmmoType> ammoTypes;

    public Caliber(String name) {
        this.name = name;
        this.ammoTypes = new ArrayList<>();
    }

    public Caliber() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AmmoType> getAmmoTypes() {
        return ammoTypes;
    }

    public void setAmmoTypes(List<AmmoType> ammoTypes) {
        this.ammoTypes = ammoTypes;
    }
}
