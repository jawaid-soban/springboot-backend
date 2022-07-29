package net.javaguides.springboot.data;

import lombok.Data;


public class Movie {
    private String title;

    Movie(){}
    public Movie(String name){this.title = title;}

    public String title() {
        return title;
    }
}
