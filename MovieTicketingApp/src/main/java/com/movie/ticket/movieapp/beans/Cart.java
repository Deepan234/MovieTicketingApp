package com.movie.ticket.movieapp.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long cartId;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Ticket> ticket;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(long cartId, List<Ticket> ticket) {
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
