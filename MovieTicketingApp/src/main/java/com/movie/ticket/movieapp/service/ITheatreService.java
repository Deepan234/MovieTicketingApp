package com.movie.ticket.movieapp.service;

import java.util.List;

import com.movie.ticket.movieapp.beans.Theatre;
import com.movie.ticket.movieapp.mappers.dto.MovieDto;
import com.movie.ticket.movieapp.mappers.dto.TheatreDto;

public interface ITheatreService {

	TheatreDto addScreen(Theatre theatre);

	List<TheatreDto> getAllScreen();

	TheatreDto getScreenById(long screenId);

	List<MovieDto> getAllMovies();

	List<TheatreDto> getAllScreenforMovieId(long movieId);

}
