package com.movie.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.springboot.externalservice.TraktService;
import com.movie.springboot.models.Movie;


@RestController
public class MovieController {
	
    @Autowired
    private TraktService _traktservice;
    @GetMapping("/movies")
    public Movie[] getPopularMovies(Pageable pageable) {
    	
    	return _traktservice.getPopulerMovies();
        
    }
}
