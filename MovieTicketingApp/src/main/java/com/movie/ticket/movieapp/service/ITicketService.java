package com.movie.ticket.movieapp.service;

import com.movie.ticket.movieapp.beans.Seat;
import com.movie.ticket.movieapp.beans.Ticket;
import com.movie.ticket.movieapp.beans.User;
import com.movie.ticket.movieapp.mappers.dto.SeatDto;
import com.movie.ticket.movieapp.mappers.dto.TicketDto;
import com.movie.ticket.movieapp.mappers.dto.UserDto;

public interface ITicketService {

	TicketDto bookTicket(Ticket ticket);

	SeatDto addSeats(Seat seat);

	TicketDto getTicketbyId(long ticketId);

	SeatDto blockSeat(long seatId);

	String cancelTicket(long ticketId);

	TicketDto placeOrder(long ticketId, long userId);

	String addTicketsToCart(long userId, long ticketId);



}
