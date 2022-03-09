package com.movie.ticket.movieapp.beans;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long movieId;
	
	@NotNull(message="movieName Should not Left Null")
	private String movieName;
	
	@NotNull(message="movieLanguage Should not Left Null")
	private String movieLanguage;
	
	@NotNull(message="movieDuration Should not Left Null")
	private String movieDuration;
	
	@NotNull(message="rating Should not Left Null")
	private String rating;
	
	@Column(name = "releaseDate")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate movieReleaseDate;
	
	@NotNull(message="price Should not Left Null")
	private BigDecimal price;

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movie(long movieId, @NotNull(message = "movieName Should not Left Null") String movieName,
			@NotNull(message = "movieLanguage Should not Left Null") String movieLanguage,
			@NotNull(message = "movieDuration Should not Left Null") String movieDuration,
			@NotNull(message = "rating Should not Left Null") String rating, LocalDate movieReleaseDate,
			@NotNull(message = "price Should not Left Null") BigDecimal price) {
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
