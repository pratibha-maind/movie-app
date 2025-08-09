package com.example.mymovies.Services;

import com.example.mymovies.mapper.MovieMapper;
import com.example.mymovies.model.Movie;
import com.example.mymovies.model.MovieRequest;
import com.example.mymovies.repository.MovieRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService {

    private Movie dummyMovie;
    private  Movie movie;
    @Autowired
    private MovieMapper mapper;
    @Autowired
    private MovieRepository movieRepository;

    public Movie getMovie(Long id){
        Optional<Movie> movie = movieRepository.findById(id);    //findById() returns a Optional type to prevent Null pointer exception. If it returns data we can use .get() to extract it.
        if(movie.isPresent())
            return movie.get();
        else {
            throw new EntityNotFoundException();
        }
    }

    public Movie addMovie(MovieRequest movieRequest){
        movie = mapper.mapRequestToMovie(movieRequest);
        Movie response = movieRepository.save(movie);
        return response;
    }
}
