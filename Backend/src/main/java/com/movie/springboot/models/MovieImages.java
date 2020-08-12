package com.movie.springboot.models;

public class MovieImages {

	private ImageUrl[] hdmovielogo;
	private ImageUrl[] hdmovieclearart;
	private ImageUrl[] movieposter;
	
	public ImageUrl[] getHdmovielogo() {
		return hdmovielogo;
	}
	public void setHdmovielogo(ImageUrl[] hdmovielogo) {
		this.hdmovielogo = hdmovielogo;
	}
	public ImageUrl[] getHdmovieclearart() {
		return hdmovieclearart;
	}
	public void setHdmovieclearart(ImageUrl[] hdmovieclearart) {
		this.hdmovieclearart = hdmovieclearart;
	}
	public ImageUrl[] getMovieposter() {
		return movieposter;
	}
	public void setMovieposter(ImageUrl[] movieposter) {
		this.movieposter = movieposter;
	}
	
}

