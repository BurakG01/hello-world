package com.movie.springboot.models;

import java.util.ArrayList;

public class Movie {
	
   private String title;
   private int year;
   private MovieImages movieImages;
   private MovieId ids;
   private String tagline; 
   private String overview; 
   private String released;
   private String country;
   private String trailer;
   private String homepage;
   private Double rating;
   private Long votes;
   private ArrayList<String> available_translations;
   private ArrayList<String> genres;
   
   

public String getTagline() {
	return tagline;
}

public void setTagline(String tagline) {
	this.tagline = tagline;
}

public String getOverview() {
	return overview;
}

public void setOverview(String overview) {
	this.overview = overview;
}

public String getReleased() {
	return released;
}

public void setReleased(String released) {
	this.released = released;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getTrailer() {
	return trailer;
}

public void setTrailer(String trailer) {
	this.trailer = trailer;
}

public String getHomepage() {
	return homepage;
}

public void setHomepage(String homepage) {
	this.homepage = homepage;
}

public Double getRating() {
	return rating;
}

public void setRating(Double rating) {
	this.rating = rating;
}

public Long getVotes() {
	return votes;
}

public void setVotes(Long votes) {
	this.votes = votes;
}

public ArrayList<String> getAvailable_translations() {
	return available_translations;
}

public void setAvailable_translations(ArrayList<String> available_translations) {
	this.available_translations = available_translations;
}

public ArrayList<String> getGenres() {
	return genres;
}

public void setGenres(ArrayList<String> genres) {
	this.genres = genres;
}

public MovieId getIds() {
	return ids;
}

public void setIds(MovieId ids) {
	this.ids = ids;
}

public MovieImages getMovieImages() {
	return movieImages;
}

public void setMovieImages(MovieImages movieImages) {
	this.movieImages = movieImages;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
} 

}
