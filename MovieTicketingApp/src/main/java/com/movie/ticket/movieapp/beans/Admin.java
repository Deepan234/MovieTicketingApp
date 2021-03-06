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
public class Admin {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long adminId;
	
	
	@Pattern(regexp = "^[A-Za-z ]{3,20}$", message = "Name must only be alphabets and whitespaces from 3 to 20 characters")
	private String adminName;
	
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Wallet wallet;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(long adminId,
		  @Pattern(regexp = "^[A-Za-z ]{3,20}$", message = "Name must only be alphabets and whitespaces from 3 to 20 characters") String adminName,
			String password, Wallet wallet) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.password = password;
		this.wallet = new Wallet();
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
