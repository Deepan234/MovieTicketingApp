package com.movie.ticket.movieapp.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Seat {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long seatId;	

	@NotNull(message="seat Name should not be null")
	private String seatName;
	
	@NotNull(message="seatType should not be null")
	private String seatType;
	
	@NotNull(message="seatPrice should not be null")
	private BigDecimal seatPrice;
	
	@Enumerated(EnumType.STRING)
	private SeatStatus seatStatus;

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seat(long seatId, @NotNull(message = "seat Name should not be null") String seatName,
			@NotNull(message = "seatType should not be null") String seatType,
			@NotNull(message = "seatPrice should not be null") BigDecimal seatPrice, SeatStatus seatStatus) {
		super();
		this.seatId = seatId;
		this.seatName = seatName;
		this.seatType = seatType;
		this.seatPrice = seatPrice;
		this.seatStatus = seatStatus;
	}

	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
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

	public SeatStatus getSeatStatus() {
		return seatStatus;
	}

	public void setSeatStatus(SeatStatus seatStatus) {
		this.seatStatus = seatStatus;
	}

	

}
