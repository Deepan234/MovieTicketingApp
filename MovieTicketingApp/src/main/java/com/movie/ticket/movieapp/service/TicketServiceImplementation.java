package com.movie.ticket.movieapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticket.movieapp.beans.Seat;
import com.movie.ticket.movieapp.beans.Ticket;
import com.movie.ticket.movieapp.exceptions.SeatNotFoundExceptions;
import com.movie.ticket.movieapp.exceptions.TicketNotFoundException;
import com.movie.ticket.movieapp.mappers.dto.SeatDto;
import com.movie.ticket.movieapp.mappers.dto.TicketDto;
import com.movie.ticket.movieapp.mappers.mapstruct.MapperInterface;
import com.movie.ticket.movieapp.repository.ISeatRepo;
import com.movie.ticket.movieapp.repository.ITicketRepo;

@Service("ticketService")
public class TicketServiceImplementation implements ITicketService{
	
	@Autowired
	ITicketRepo ticketRepo;
	
	@Autowired
	ISeatRepo seatRepo;

	@Override
	public TicketDto bookTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		if(ticket != null) {
			List<Seat> seat = ticket.getSeatList();
			seatRepo.saveAllAndFlush(seat);
		}
	    Ticket tickets = ticketRepo.save(ticket);
	    
	    if(tickets == null) {
	    	throw new TicketNotFoundException("No tickets Found");
	    }
		return null;
	}

	@Override
	public SeatDto addSeats(Seat seat) {
		// TODO Auto-generated method stub
		Seat seats = seatRepo.save(seat);
		if(seats == null) {
			throw new SeatNotFoundExceptions("Seat not added");
		}
		return MapperInterface.INSTANCE.seatToSeatDto(seats);
	}
	
	

}
