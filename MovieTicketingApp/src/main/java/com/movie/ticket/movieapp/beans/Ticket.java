package com.movie.ticket.movieapp.beans;


import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity 
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long ticketId;
	
	@ManyToOne
	private Theatre theatre;
	
	@OneToMany
	private List<Seat> seatList;
	
	private String showName;
	
	
	@Column(name = "releaseDate")
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate showDate;
	
	private String showTiming;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(long ticketId, Theatre theatre, List<Seat> seatList, String showName, LocalDate showDate,
			String showTiming) {
		super();
		this.ticketId = ticketId;
		this.theatre = theatre;
		this.seatList = seatList;
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

	public List<Seat> getSeatList() {
		return seatList;
	}

	public void setSeatList(List<Seat> seatList) {
		this.seatList = seatList;
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
