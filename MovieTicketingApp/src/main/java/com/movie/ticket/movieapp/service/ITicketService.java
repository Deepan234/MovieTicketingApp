package com.movie.ticket.movieapp.service;

import com.movie.ticket.movieapp.beans.Seat;
import com.movie.ticket.movieapp.beans.Ticket;
import com.movie.ticket.movieapp.mappers.dto.SeatDto;
import com.movie.ticket.movieapp.mappers.dto.TicketDto;

public interface ITicketService {

	TicketDto bookTicket(Ticket ticket);

	SeatDto addSeats(Seat seat);

}