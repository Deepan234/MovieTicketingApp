package com.movie.ticket.movieapp.mappers.dto;

import java.math.BigDecimal;



public class WalletDto {
	
	
	private long walletId;
	
	private BigDecimal balance;

	public WalletDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WalletDto(long walletId, BigDecimal balance) {
		super();
		this.walletId = walletId;
		this.balance = balance;
	}

	public long getWalletId() {
		return walletId;
	}

	public void setWalletId(long walletId) {
		this.walletId = walletId;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	
	

}
