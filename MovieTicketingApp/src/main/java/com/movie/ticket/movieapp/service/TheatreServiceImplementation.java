package com.movie.ticket.movieapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticket.movieapp.beans.Movie;
import com.movie.ticket.movieapp.beans.Theatre;
import com.movie.ticket.movieapp.exceptions.TheatreNotFoundException;
import com.movie.ticket.movieapp.mappers.dto.MovieDto;
import com.movie.ticket.movieapp.mappers.dto.TheatreDto;
import com.movie.ticket.movieapp.mappers.mapstruct.MapperInterface;
import com.movie.ticket.movieapp.repository.IMovieRepo;
import com.movie.ticket.movieapp.repository.ITheatreRepo;

@Service("theatreService")
public class TheatreServiceImplementation implements ITheatreService {
	
	@Autowired
	ITheatreRepo theatreRepo;
	
	@Autowired
	IMovieRepo movieRepo;

	@Override
	public TheatreDto addScreen(Theatre theatre) {
		// TODO Auto-generated method stub
		
	    Theatre theatres = theatreRepo.save(theatre);
	    if(theatres == null) {
	    	throw new TheatreNotFoundException("theatre not found");
	    }
		return MapperInterface.INSTANCE.theatreToTheatreDto(theatres);
	}

	@Override
	public List<TheatreDto> getAllScreen() {
		// TODO Auto-generated method stub
		List<Theatre> theatre = theatreRepo.findAll();
		return MapperInterface.INSTANCE.theatreListToTheatreListDto(theatre);
	}

	@Override
	public TheatreDto getScreenById(long screenId) {
		// TODO Auto-generated method stub
		Theatre theatre = theatreRepo.getById(screenId);
		if(theatre == null) {
			throw new TheatreNotFoundException("theatre not found");
		}
		return MapperInterface.INSTANCE.theatreToTheatreDto(theatre);
	}

	@Override
	public List<MovieDto> getAllMovies() {
		// TODO Auto-generated method stub
		List<Movie> movieList = movieRepo.findAll();
		return MapperInterface.INSTANCE.movieListtoMovieDtoList(movieList);
	}

//	public List<TheatreDto> getAllScreenforMovieId(long movieId) {
//		// TODO Auto-generated method stub
//		List<Theatre> screenList = theatreRepo.findAll();
//		List<Theatre> screenListAltered = screenList.stream().filter(theatre -> theatre.getMovie().getMovieId() == movieId).toList();
//		return MapperInterface.INSTANCE.theatreListToTheatreListDto(screenListAltered);
//	}
//	
	
}
