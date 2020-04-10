package com.hqyj.entity;

public class Email {
	private String sender;
	private String userName;
	private String password;
	
	

	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Email(String sender, String userName, String password) {
		super();
		this.sender = sender;
		this.userName = userName;
		this.password = password;
	}



	public String getSender() {
		return sender;
	}


	public void setSender(String sender) {
		this.sender = sender;
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


	@Override
	public String toString() {
		return "Email [sender=" + sender + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
}
