package com.example.mymovies.controller;

import com.example.mymovies.Services.MovieService;
import com.example.mymovies.model.Movie;
import com.example.mymovies.model.MovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(path = "/movie/{id}")
    public Movie getMovie(@PathVariable Long id){
        return movieService.getMovie(id);
    }

    @PostMapping(path= "/movie")
    public Movie addMovie(@RequestBody MovieRequest movie){
        return movieService.addMovie(movie);
    }
}
