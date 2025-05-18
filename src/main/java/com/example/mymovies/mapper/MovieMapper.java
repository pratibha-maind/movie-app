package com.example.mymovies.mapper;

import com.example.mymovies.model.Movie;
import com.example.mymovies.model.MovieRequest;
import org.springframework.stereotype.Component;

@Component
public class MovieMapper {

    public Movie mapRequestToMovie(MovieRequest movieRequest) {
        Movie movie = new Movie();
        movie.setName(movieRequest.name);
        movie.setGenre(movieRequest.genre);
        movie.setRating(movieRequest.rating);
        return movie;
    }
}
