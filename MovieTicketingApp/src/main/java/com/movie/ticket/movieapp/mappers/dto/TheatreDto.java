package com.movie.ticket.movieapp.mappers.dto;


import com.movie.ticket.movieapp.beans.Movie;

public class TheatreDto {
	
	    private long screenId;
	    
	    private String screenName;
	    
	    private Movie movie;

		public TheatreDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public TheatreDto(long screenId, String screenName, Movie movie) {
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
