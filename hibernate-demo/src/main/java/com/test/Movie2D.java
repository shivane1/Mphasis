package com.test;

import javax.persistence.Entity;

@Entity
public class Movie2D extends Movie {

    private String casting;

    public String getCasting() { return casting; }
    public void setCasting(String casting) { this.casting = casting; }
}
