package com.movie.springboot.externalservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.movie.springboot.models.Movie;

@Service
public class TraktService {
	 private final RestTemplate restTemplate;
	 @Value("${trakt.apikey}")
	 private String _traktApiKey;
	 @Autowired
	 private FanartService _fanartService;
	 
	  public TraktService(RestTemplateBuilder restTemplateBuilder) {
	        this.restTemplate = restTemplateBuilder.build();
	    }
	  

	    public Movie[] getPopulerMovies() {
	    	
	    	
	        String url = "https://api.trakt.tv/movies/popular?extended=full";
	        
	        HttpHeaders headers = new HttpHeaders();
	        
	        headers.set("trakt-api-key", _traktApiKey);
	        headers.set("Content-Type", "application/json");
	        headers.set("trakt-api-version", "2");
	      
	        HttpEntity request = new HttpEntity(headers);
	        
	        ResponseEntity<Movie[]> response = this.restTemplate.exchange(url, HttpMethod.GET, request, Movie[].class, 1);
	        
	        if(response.getStatusCode() == HttpStatus.OK) {
	        	
	        	
	        	for (Movie item : response.getBody()) 
	        	{ 
	        	
	        	   item.setMovieImages(_fanartService.getImages(item.getIds().getTmdb()));
	        	   
	        	}
	        
	            return response.getBody();
	        } else {
	            return null;
	        }
	    }
}
