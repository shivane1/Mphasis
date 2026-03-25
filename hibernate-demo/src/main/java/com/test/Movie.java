package com.test;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQuery(name = "Movie.findAll", query = "from Movie")
public class Movie {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private double rating;

    // getters setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
}

