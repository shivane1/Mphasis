package com.test;

import javax.persistence.Entity;

@Entity
public class Movie3D extends Movie {

    private String technology;

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
