package com.movie.ticket.movieapp.mappers.dto;

import java.math.BigDecimal;
import java.util.List;

import com.movie.ticket.movieapp.beans.Ticket;

public class OrderDto {

	    private long orderId;  
	   
	    private List<Ticket> ticket;
	   
	    private BigDecimal totalAmount;

	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDto(long orderId, List<Ticket> ticket, BigDecimal totalAmount) {
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
