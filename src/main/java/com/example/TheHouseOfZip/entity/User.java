package com.example.TheHouseOfZip.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long UserId;
	private String username;
	private String mobileNo;
	private String password;
	private String email;
	
	
	public User(String username, String mobileNo, String password, String email) {
		
		this.username = username;
		this.mobileNo = mobileNo;
		this.password = password;
		this.email = email;
	}


	public Long getUserId() {
		return UserId;
	}


	public String getUsername() {
		return username;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public String getPassword() {
		return password;
	}


	public String getEmail() {
		return email;
	}
	
}