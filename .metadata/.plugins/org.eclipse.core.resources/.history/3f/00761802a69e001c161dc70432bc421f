package com.movie.ticket.movieapp.beans;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long orderId;
   
    @OneToMany
    private List<Ticket> ticket;
   
    private BigDecimal totalAmount;

    public Orders() {
	super();
	// TODO Auto-generated constructor stub
    }

	public Orders(long orderId, List<Ticket> ticket, BigDecimal totalAmount) {
		super();
		this.orderId = orderId;
		this.ticket = ticket;
		this.totalAmount = totalAmount;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	
   
   	
}
