package com.movie.ticket.movieapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.movie.ticket.movieapp.exceptions.MovieNotFoundException;
import com.movie.ticket.movieapp.exceptions.PasswordWrongExceptions;
import com.movie.ticket.movieapp.exceptions.SeatBookedExceptions;
import com.movie.ticket.movieapp.exceptions.SeatNotFoundExceptions;
import com.movie.ticket.movieapp.exceptions.TheatreNotFoundException;
import com.movie.ticket.movieapp.exceptions.TicketNotFoundException;
import com.movie.ticket.movieapp.exceptions.UserNotFoundException;

@ControllerAdvice
public class Exceptions {
	
	@ExceptionHandler(value = PasswordWrongExceptions.class)
	public ResponseEntity<Object> exceptionConstraintViolationException(PasswordWrongExceptions exception) {
	    return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = MovieNotFoundException.class)
	public ResponseEntity<Object> exceptionConstraintViolationException(MovieNotFoundException exception) {
	    return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler(value = TheatreNotFoundException.class)
	public ResponseEntity<Object> exceptionConstraintViolationException(TheatreNotFoundException exception) {
	    return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = TicketNotFoundException.class)
	public ResponseEntity<Object> exceptionConstraintViolationException(TicketNotFoundException exception) {
	    return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = SeatNotFoundExceptions.class)
	public ResponseEntity<Object> exceptionConstraintViolationException(SeatNotFoundExceptions exception) {
	    return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = SeatBookedExceptions.class)
	public ResponseEntity<Object> exceptionConstraintViolationException(SeatBookedExceptions exception) {
	    return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = UserNotFoundException.class)
	public ResponseEntity<Object> exceptionConstraintViolationException(UserNotFoundException exception) {
	    return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
	}
	
	
}
