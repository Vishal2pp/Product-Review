package com.test.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Login {
	
	private String userName;
	private String password;
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
	@Override
	public String toString() {
		return "login [userName=" + userName + ", password=" + password + "]";
	}
}