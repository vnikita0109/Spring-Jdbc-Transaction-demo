package com.stackroute.services;

import com.stackroute.dao.MovieDAO;
import com.stackroute.model.Movie;
import org.springframework.transaction.annotation.Transactional;

public class MovieManagerImpl implements MovieManager{
    private MovieDAO movieDAO;
    public void setMovieDAO(MovieDAO movieDAO){

        this.movieDAO=movieDAO;
    }
    @Transactional
    public void createMovie(Movie movie) {
        movieDAO.create(movie);
    }
}
