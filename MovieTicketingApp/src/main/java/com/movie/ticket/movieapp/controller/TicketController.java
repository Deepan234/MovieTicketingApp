package com.movie.ticket.movieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.movieapp.beans.Seat;
import com.movie.ticket.movieapp.beans.Ticket;
import com.movie.ticket.movieapp.mappers.dto.SeatDto;
import com.movie.ticket.movieapp.mappers.dto.TicketDto;
import com.movie.ticket.movieapp.mappers.mapstruct.MapperInterface;
import com.movie.ticket.movieapp.service.ITicketService;

@RestController
@RequestMapping("/ticketapi")
public class TicketController {
	
	@Autowired
	ITicketService ticketService;
	
	public ResponseEntity<TicketDto>  bookTicket(@RequestBody TicketDto ticketDto){
       Ticket ticket = MapperInterface.INSTANCE.ticketDtoToTicket(ticketDto);
       TicketDto ticketsDto = ticketService.bookTicket(ticket);
       return new ResponseEntity<TicketDto>(ticketsDto,HttpStatus.OK);
	}
	
	
	public ResponseEntity<SeatDto> AddSeats(@RequestBody SeatDto seatDto){
	     Seat seat = MapperInterface.INSTANCE.seatDtoToSeat(seatDto);
	     SeatDto seatsDto = ticketService.addSeats(seat);
	     return new ResponseEntity<SeatDto>(seatsDto,HttpStatus.OK);
	}
}
