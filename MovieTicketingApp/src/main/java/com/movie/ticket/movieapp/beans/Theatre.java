package com.movie.ticket.movieapp.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Theatre {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long screenId;
    
    private String screenName;
    
    @ManyToOne(cascade=CascadeType.MERGE,fetch=FetchType.EAGER)  
    private Movie movie;

	public Theatre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Theatre(long screenId, String screenName, Movie movie) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.movie = movie;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	
    
    
    
}
