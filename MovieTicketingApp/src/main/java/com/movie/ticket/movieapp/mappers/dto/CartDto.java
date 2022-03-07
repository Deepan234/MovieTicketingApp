package com.movie.ticket.movieapp.mappers.dto;

import java.util.List;
import com.movie.ticket.movieapp.beans.Ticket;


public class CartDto {
	
	private long cartId;
	
	private List<Ticket> ticket;

	public CartDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartDto(long cartId, List<Ticket> ticket) {
		super();
		this.cartId = cartId;
		this.ticket = ticket;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}
	
	

}
