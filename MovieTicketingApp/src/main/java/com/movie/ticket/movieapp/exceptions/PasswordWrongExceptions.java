package com.movie.ticket.movieapp.exceptions;

public class PasswordWrongExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PasswordWrongExceptions(String msg) {
		super(msg);
	}
}
