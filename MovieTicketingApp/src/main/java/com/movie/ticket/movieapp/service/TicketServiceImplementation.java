package com.movie.ticket.movieapp.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.ticket.movieapp.beans.Admin;

import com.movie.ticket.movieapp.beans.Seat;
import com.movie.ticket.movieapp.beans.SeatStatus;
import com.movie.ticket.movieapp.beans.Ticket;
import com.movie.ticket.movieapp.beans.User;
import com.movie.ticket.movieapp.exceptions.SeatBookedExceptions;
import com.movie.ticket.movieapp.exceptions.SeatNotFoundExceptions;
import com.movie.ticket.movieapp.exceptions.TicketNotFoundException;

import com.movie.ticket.movieapp.mappers.dto.SeatDto;
import com.movie.ticket.movieapp.mappers.dto.TicketDto;
import com.movie.ticket.movieapp.mappers.dto.UserDto;
import com.movie.ticket.movieapp.mappers.mapstruct.MapperInterface;
import com.movie.ticket.movieapp.repository.IAdminRepo;

import com.movie.ticket.movieapp.repository.ISeatRepo;
import com.movie.ticket.movieapp.repository.ITicketRepo;
import com.movie.ticket.movieapp.repository.IWalletRepo;

@Service("ticketService")
public class TicketServiceImplementation implements ITicketService{
	
	@Autowired
	ITicketRepo ticketRepo;
	
	@Autowired
	ISeatRepo seatRepo;
	

	
	@Autowired
	IWalletRepo userRepo;
	
	@Autowired
	IAdminRepo adminRepo;

	@Override
	public TicketDto bookTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		for(int i=0;i<ticket.getSeatList().size();i++) {
			long seat = ticket.getSeatList().get(i).getSeatId();
			Seat seater = seatRepo.getById(seat);
			if(seater.getSeatStatus().equals(SeatStatus.UNBOOKED)) {
				seater.setSeatStatus(SeatStatus.BOOKED);
				seatRepo.save(seater);
			}
			else {
				throw new SeatBookedExceptions("Seat "+i+" is already Booked Or Blocked");
			}
		}
		Ticket tickets = ticketRepo.saveAndFlush(ticket); 
	    if(tickets == null) {
	    	throw new TicketNotFoundException("No tickets Found");
	    }
	    System.out.println(tickets.getSeatList());
		return MapperInterface.INSTANCE.ticketToTicketDto(tickets);
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

	@Override
	public TicketDto getTicketbyId(long ticketId) {
		// TODO Auto-generated method stub
		Ticket ticket = ticketRepo.getById(ticketId);
		if(ticket == null) {
			throw new TicketNotFoundException("Ticket does not present in this id");
		}
		return MapperInterface.INSTANCE.ticketToTicketDto(ticket);
	}

	@Override
	public SeatDto blockSeat(long seatId) {
		// TODO Auto-generated method stub
		Seat seat = seatRepo.getById(seatId);
		if(seat == null) {
			throw new SeatNotFoundExceptions("Seat not added");
		}
		seat.setSeatStatus(SeatStatus.BLOCKED);
		Seat seats = seatRepo.save(seat);
		return MapperInterface.INSTANCE.seatToSeatDto(seats);
	}

	@Override
	public String cancelTicket(long ticketId) {
		// TODO Auto-generated method stub
		Ticket ticket = ticketRepo.getById(ticketId);
		if(ticket == null) {
			throw new TicketNotFoundException("Ticket is not found");
		}
		for(int i=0;i<ticket.getSeatList().size();i++) {
			long seatId = ticket.getSeatList().get(i).getSeatId();
			Seat seat = seatRepo.getById(seatId);
			seat.setSeatStatus(SeatStatus.UNBOOKED);
			seatRepo.save(seat);
		}
		ticketRepo.delete(ticket);
		return "Deleted Sucessfully";
	}

	@Override
	public TicketDto placeOrder(long ticketId, long userId) {
		// TODO Auto-generated method stub
		long adminId = 39;
		Ticket ticket = ticketRepo.getById(ticketId);
		User user = userRepo.getById(userId);
	    Admin admin = adminRepo.getById(adminId);
		if(ticket == null) {
			throw new TicketNotFoundException("Ticket is not found");
		}
		BigDecimal balance = new BigDecimal(0);
		for( int i=0;i< ticket.getSeatList().size();i++) {
			balance = balance.add(ticket.getSeatList().get(i).getSeatPrice());
		}
		user.getWallet().setBalance(user.getWallet().getBalance().subtract(balance));
		admin.getWallet().setBalance(admin.getWallet().getBalance().add(balance));
		userRepo.save(user);
		adminRepo.save(admin);
		ticket.setTotalAmount(balance);
		ticketRepo.save(ticket);
		return MapperInterface.INSTANCE.ticketToTicketDto(ticket);
	}

	@Override
	public String addTicketsToCart(long userId, long ticketId) {
		// TODO Auto-generated method stub
	    Ticket ticket = ticketRepo.getById(ticketId);
	    User userInduival = userRepo.getById(userId);
	    List<Ticket> ticketList = userInduival.getCart().getTicket();
	    ticketList.add(ticket);
	    System.out.println(userInduival.getCart().getTicket().get(0).getShowName());
	    User users = userRepo.save(userInduival);
	    System.out.println(users.getCart().getTicket().get(0).getShowName());
		return "Tickets Added To Cart";
	}
	
	
	

}
