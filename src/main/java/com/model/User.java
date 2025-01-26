package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
    @Column
	private String username;
    @Column
	private String password;
    @Column
	private Integer mobile;
    @Column
	private String address;
	@Column
    private String role;


	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, Integer mobile, String address,String role) {
		super();

		this.username = username;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
    	this.role = role;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		role = role;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", mobile=" + mobile + ", address=" + address
				+ ", role=" + role + "]";
	}
	
}
