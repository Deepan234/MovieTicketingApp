package com.movie.ticket.movieapp.mappers.dto;


import com.movie.ticket.movieapp.beans.Wallet;

public class AdminDto {
	
	private long adminId;
	
	private String adminName;
	
	private String password;
	
	private Wallet wallet;

	public AdminDto(long adminId, String adminName, String password, Wallet wallet) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.password = password;
		this.wallet = wallet;
	}

	public AdminDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getAdminId() {
		return adminId;
	}

	public void setAdminId(long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	

}
