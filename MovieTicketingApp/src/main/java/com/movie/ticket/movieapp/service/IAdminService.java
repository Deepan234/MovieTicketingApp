package com.movie.ticket.movieapp.service;

import com.movie.ticket.movieapp.beans.Admin;
import com.movie.ticket.movieapp.beans.Movie;
import com.movie.ticket.movieapp.mappers.dto.AdminDto;
import com.movie.ticket.movieapp.mappers.dto.MovieDto;

public interface IAdminService {

	AdminDto createAdmin(Admin admin);

	AdminDto validateLogin(String adminName,String password);

	MovieDto addMovie(Movie movie);

	MovieDto updateMovie(Movie movie);

	String deleteMovies(Movie movie);

	MovieDto getMovies(long movieId);

}
