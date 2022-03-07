package com.movie.ticket.movieapp.beans;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity 
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ticketId;
	
	@ManyToOne
	private Theatre theatre;
	
	@NotNull(message="seat Name should not be null")
	private String seatName;
	
	@NotNull(message="seatType should not be null")
	private String seatType;
	
	@NotNull(message="seatPrice should not be null")
	private BigDecimal seatPrice;
	
	private String showName;
	
	
	@Column(name = "releaseDate")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate showDate;
	
	private String showTiming;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(long ticketId, Theatre theatre, @NotNull(message = "seat Name should not be null") String seatName,
			@NotNull(message = "seatType should not be null") String seatType,
			@NotNull(message = "seatPrice should not be null") BigDecimal seatPrice, String showName,
			LocalDate showDate, String showTiming) {
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
