package com.movie.ticket.movieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.ticket.movieapp.beans.Seat;
import com.movie.ticket.movieapp.beans.Ticket;
import com.movie.ticket.movieapp.beans.User;
import com.movie.ticket.movieapp.mappers.dto.SeatDto;
import com.movie.ticket.movieapp.mappers.dto.TicketDto;
import com.movie.ticket.movieapp.mappers.dto.UserDto;
import com.movie.ticket.movieapp.mappers.mapstruct.MapperInterface;
import com.movie.ticket.movieapp.service.ITicketService;

@RestController
@RequestMapping("/ticketapi")
public class TicketController {
	
	@Autowired
	ITicketService ticketService;
	
	@PostMapping("/bookTicket")
	public ResponseEntity<TicketDto>  bookTicket(@RequestBody TicketDto ticketDto){
       Ticket ticket = MapperInterface.INSTANCE.ticketDtoToTicket(ticketDto);
       TicketDto ticketsDto = ticketService.bookTicket(ticket);
       return new ResponseEntity<TicketDto>(ticketsDto,HttpStatus.OK);
	}
	
	@PostMapping("/addSeats")
	public ResponseEntity<SeatDto> AddSeats(@RequestBody SeatDto seatDto){
	     Seat seat = MapperInterface.INSTANCE.seatDtoToSeat(seatDto);
	     SeatDto seatsDto = ticketService.addSeats(seat);
	     return new ResponseEntity<SeatDto>(seatsDto,HttpStatus.OK);
	}
	
	@GetMapping("/getTickets")
	public ResponseEntity<TicketDto> getTicket(@RequestParam long ticketId){
		TicketDto ticketDto = ticketService.getTicketbyId(ticketId);
		return new ResponseEntity<TicketDto>(ticketDto,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/cancelTickets")
	public String  cancelTicket(@RequestParam long ticketId) {
		String ticketDto = ticketService.cancelTicket(ticketId);
		return ticketDto;
	}
	
	@GetMapping("/ticketplaceorder")
	public ResponseEntity<TicketDto> ticketPlaceOrder(@RequestParam long ticketId,@RequestParam long userId){
	   TicketDto ticket = ticketService.placeOrder(ticketId,userId);
	   return new ResponseEntity<TicketDto>(ticket,HttpStatus.OK);
	   
	}
	
	@PostMapping("/addTicketsToCustomer")
    public String addTicketsToCustomerCart(@RequestParam long userId,@RequestParam long ticketId){
		String users = ticketService.addTicketsToCart(userId,ticketId);
		return users;
		
	}
	
}
