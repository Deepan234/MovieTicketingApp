package com.movie.ticket.movieapp.service;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticket.movieapp.beans.Admin;
import com.movie.ticket.movieapp.beans.Movie;
import com.movie.ticket.movieapp.exceptions.MovieNotFoundException;
import com.movie.ticket.movieapp.exceptions.PasswordWrongExceptions;
import com.movie.ticket.movieapp.mappers.dto.AdminDto;
import com.movie.ticket.movieapp.mappers.dto.MovieDto;
import com.movie.ticket.movieapp.mappers.mapstruct.MapperInterface;
import com.movie.ticket.movieapp.repository.IAdminRepo;
import com.movie.ticket.movieapp.repository.IMovieRepo;

@Service("adminService")
public class AdminServiceImplementation implements IAdminService{
	
	
	@Autowired
	IAdminRepo adminRepo;
	
	@Autowired
	IMovieRepo movieRepo;

	@Override
	public AdminDto createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		
	    if(validatePassword(admin.getPassword())) {
	    	throw new PasswordWrongExceptions("password doesnot match the format");
	    }
	    String password = Integer.valueOf(admin.getPassword().hashCode()).toString();
	    admin.setPassword(password);    
		return MapperInterface.INSTANCE.adminToAdminDto(adminRepo.save(admin));
	}
	
	private static boolean validatePassword(String password) {
		boolean flag = true;
		if (Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()[{}]:;',?/*~$^+=<>]).{8,20}$", password)) {
			flag = false;
		}
		return flag;
	}

	@Override
	public AdminDto validateLogin(String adminName,String password) {
		// TODO Auto-generated method stub
		password = Integer.valueOf(password.hashCode()).toString();
		Admin admins = adminRepo.validateLogin(adminName, password);
		if(admins == null) {
			throw new PasswordWrongExceptions("Wrong credentials");
		}
		return MapperInterface.INSTANCE.adminToAdminDto(admins);
	}

	@Override
	public MovieDto addMovie(Movie movie) {
		// TODO Auto-generated method stub
	    Movie movies =   movieRepo.save(movie);
	    if(movies == null) {
	    	throw new MovieNotFoundException("Movie Not Found");
	    }
		return MapperInterface.INSTANCE.movieToMovieDto(movies);
	}

	@Override
	public MovieDto updateMovie(Movie movie) {
		// TODO Auto-generated method stub
		Movie movies = movieRepo.save(movie);
		if(movies == null) {
			throw new MovieNotFoundException("Movie Not Found");
		}
		return MapperInterface.INSTANCE.movieToMovieDto(movies);
	}

	@Override
	public String deleteMovies(Movie movie) {
		// TODO Auto-generated method stub
		Movie movies = movieRepo.getById(movie.getMovieId());
		if(movies == null) {
			throw new MovieNotFoundException("No Movie Found For that Id");
		}
	    movieRepo.deleteById(movie.getMovieId());
		return "Movie Deleted Sucessfully";
	}

	@Override
	public MovieDto getMovies(long movieId) {
		// TODO Auto-generated method stub
		Movie movies = movieRepo.getById(movieId);
		if(movies == null) {
			throw new MovieNotFoundException("No Movie Found For that Id");
		}	
		return MapperInterface.INSTANCE.movieToMovieDto(movies);
	}
}
