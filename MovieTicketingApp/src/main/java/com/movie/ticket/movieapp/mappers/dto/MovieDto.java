package com.movie.ticket.movieapp.mappers.dto;

import java.math.BigDecimal;
import java.time.LocalDate;


public class MovieDto {
	
	private long movieId;
	
	private String movieName;
	
	private String movieLanguage;
	
	private String movieDuration;
	
	
	private String rating;
	

	private LocalDate movieReleaseDate;
	
	private BigDecimal price;

	public MovieDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MovieDto(long movieId, String movieName, String movieLanguage, String movieDuration, String rating,
			LocalDate movieReleaseDate, BigDecimal price) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieLanguage = movieLanguage;
		this.movieDuration = movieDuration;
		this.rating = rating;
		this.movieReleaseDate = movieReleaseDate;
		this.price = price;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public String getMovieDuration() {
		return movieDuration;
	}

	public void setMovieDuration(String movieDuration) {
		this.movieDuration = movieDuration;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	


}
