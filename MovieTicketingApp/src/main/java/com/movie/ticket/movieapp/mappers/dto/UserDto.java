package com.movie.ticket.movieapp.mappers.dto;

import com.movie.ticket.movieapp.beans.Cart;
import com.movie.ticket.movieapp.beans.Wallet;

public class UserDto {
	
    private long userId;
	
	private String userName;
	
	private String password;

	private String phoneNumber;

	private Cart cart;
	
	private Wallet wallet;

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(long userId, String userName, String password, String phoneNumber, Cart cart, Wallet wallet) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.cart = cart;
		this.wallet = wallet;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

    
	
}
