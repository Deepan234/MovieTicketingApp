package com.movie.ticket.movieapp.mappers.dto;

import java.math.BigDecimal;

import com.movie.ticket.movieapp.beans.SeatStatus;


public class SeatDto {
	
	private long seatId;	

	private String seatName;
	
	private String seatType;
	
	private BigDecimal seatPrice;
	
	private SeatStatus seatStatus;

	public SeatDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SeatDto(long seatId, String seatName, String seatType, BigDecimal seatPrice, SeatStatus seatStatus) {
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
