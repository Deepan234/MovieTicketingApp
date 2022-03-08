package com.movie.ticket.movieapp.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	@NotNull(message="Name Should not Left Null")
	@Pattern(regexp = "^[A-Za-z ]{3,20}$", message = "Name must only be alphabets and whitespaces from 3 to 20 characters")
	private String userName;
	
	private String password;
	
	@Pattern(regexp = "^[6-9]{1}[0-9]{9}", message = "Mobile number should be a 10 digit number with first digit from 6 to 9")
	private String phoneNumber;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Cart cart;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Wallet wallet;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long userId,
			@NotNull(message = "Name Should not Left Null") @Pattern(regexp = "^[A-Za-z ]{3,20}$", message = "Name must only be alphabets and whitespaces from 3 to 20 characters") String userName,
			String password,
			@Pattern(regexp = "^[6-9]{1}[0-9]{9}", message = "Mobile number should be a 10 digit number with first digit from 6 to 9") String phoneNumber,
			Cart cart, Wallet wallet) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.cart = new Cart();
		this.wallet = new Wallet();
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
