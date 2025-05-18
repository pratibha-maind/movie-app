package com.example.MyMovies.controller;

import com.example.MyMovies.Services.MovieService;
import com.example.MyMovies.model.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    private MovieService movieService;

    @RequestMapping(path = "/movies")
    public Movie getMovies(){
        return movieService.getMovies();
    }
}
