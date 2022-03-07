package com.movie.ticket.movieapp.mappers.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.movie.ticket.movieapp.beans.Theatre;

public class TicketDto {

	private long ticketId;
	
	private Theatre theatre;
	
	private String seatName;
	
	private String seatType;

	private BigDecimal seatPrice;
	
	private String showName;
	
	private LocalDate showDate;
	
	private String showTiming;

	public TicketDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TicketDto(long ticketId, Theatre theatre, String seatName, String seatType, BigDecimal seatPrice,
			String showName, LocalDate showDate, String showTiming) {
		super();
		this.ticketId = ticketId;
		this.theatre = theatre;
		this.seatName = seatName;
		this.seatType = seatType;
		this.seatPrice = seatPrice;
		this.showName = showName;
		this.showDate = showDate;
		this.showTiming = showTiming;
	}

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	public String getSeatName() {
		return seatName;
	}

	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}

	public String getSeatType() {
		return seatType;
	}

	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}

	public BigDecimal getSeatPrice() {
		return seatPrice;
	}

	public void setSeatPrice(BigDecimal seatPrice) {
		this.seatPrice = seatPrice;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public LocalDate getShowDate() {
		return showDate;
	}

	public void setShowDate(LocalDate showDate) {
		this.showDate = showDate;
	}

	public String getShowTiming() {
		return showTiming;
	}

	public void setShowTiming(String showTiming) {
		this.showTiming = showTiming;
	}
	
	
	
	
}
