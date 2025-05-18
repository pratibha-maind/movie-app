package com.example.mymovies.Services;

import com.example.mymovies.mapper.MovieMapper;
import com.example.mymovies.model.Movie;
import com.example.mymovies.model.MovieRequest;
import com.example.mymovies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    private Movie dummyMovie;
    private  Movie movie;
    @Autowired
    private MovieMapper mapper;
    @Autowired
    private MovieRepository movieRepository;

    public Movie getMovies(){
        dummyMovie = new Movie("Top Gun", 7.8, "Action");
        return dummyMovie;
    }

    public Movie addMovie(MovieRequest movieRequest){
        movie = mapper.mapRequestToMovie(movieRequest);
        Movie response = movieRepository.save(movie);
        return response;
    }
}
