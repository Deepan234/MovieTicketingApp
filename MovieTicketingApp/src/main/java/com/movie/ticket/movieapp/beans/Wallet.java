package com.movie.ticket.movieapp.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wallet {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long walletId;
	
	private BigDecimal balance;

	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Wallet(long walletId, BigDecimal balance) {
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
