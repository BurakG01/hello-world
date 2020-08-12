package com.movie.springboot.externalservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.movie.springboot.models.MovieImages;

@Service
public class FanartService {
	
	 private final RestTemplate restTemplate;
	 @Value("${fanart.apikey}")
	 private String _fanartApiKey;
	 
	  public FanartService(RestTemplateBuilder restTemplateBuilder) {
	        this.restTemplate = restTemplateBuilder.build();
	    }
	  

	    public MovieImages getImages(long tmdId) {
	    	
	        String url = "http://webservice.fanart.tv/v3/movies/"+tmdId+"?api_key="+_fanartApiKey;
	        
	       return  this.restTemplate.getForObject(url, MovieImages.class, 1);
	    }
}
