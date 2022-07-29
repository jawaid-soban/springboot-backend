package net.javaguides.springboot.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.util.Arrays.asList;

public class MovieStore {
    List<Movie> movies = new LinkedList<Movie>();

    public List<Movie> findByPartialTitle(String partialTitle) {
        for (Movie movie : movies){
            if(movie.title().contains(partialTitle))
                return asList(movie);
        }
        return new ArrayList<>();
    }

    public void add(Movie movie) {
        movies.add(movie);
    }
}
