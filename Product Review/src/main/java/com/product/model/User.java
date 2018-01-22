package com.product.model;

public class User{

	private String uEmail;
	private String uGender;
	private String uMobile;
	private String uName;
	private String uPassword;

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	public String getuGender() {
		return uGender;
	}

	public void setuGender(String uGender) {
		this.uGender = uGender;
	}

	public String getuMobile() {
		return uMobile;
	}

	public void setuMobile(String uMobile) {
		this.uMobile = uMobile;
	}

	@Override
	public String toString() {
		return "User [uEmail=" + uEmail + ", uGender=" + uGender + ", uMobile=" + uMobile + ", uName=" + uName
				+ ", uPassword=" + uPassword + "]";
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

}