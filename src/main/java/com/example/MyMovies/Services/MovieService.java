package com.example.MyMovies.Services;

import com.example.MyMovies.model.Movie;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private Movie dummyMovie;
    public Movie getMovies(){
        dummyMovie = new Movie("Top Gun", 7.8, "Action");
        return dummyMovie;
    }
}
