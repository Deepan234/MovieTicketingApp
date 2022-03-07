package com.movie.ticket.movieapp.exceptions;

public class SeatNotFoundExceptions extends RuntimeException {

		private static final long serialVersionUID = 1L;

		public SeatNotFoundExceptions(String msg) {
			super(msg);
		}
}


