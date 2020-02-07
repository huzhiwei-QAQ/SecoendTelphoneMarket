package com.hqyj.entity;

public class User {
private int u_id;
private String username;
private String password;
private String email;
private String verificationCode;
private Role role;
public User() {
	super();
	// TODO Auto-generated constructor stub
}




public User(int u_id, String username, String password, String email, String verificationCode, Role role) {
	super();
	this.u_id = u_id;
	this.username = username;
	this.password = password;
	this.email = email;
	this.verificationCode = verificationCode;
	this.role = role;
}

public int getU_id() {
	return u_id;
}

public void setU_id(int u_id) {
	this.u_id = u_id;
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



public Role getRole() {
	return role;
}





public void setRole(Role role) {
	this.role = role;
}





public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}


public String getVerificationCode() {
	return verificationCode;
}




public void setVerificationCode(String verificationCode) {
	this.verificationCode = verificationCode;
}




@Override
public String toString() {
	return "User [u_id=" + u_id + ", username=" + username + ", password=" + password + ", email=" + email
			+ ", verificationCode=" + verificationCode + ", role=" + role + "]";
}

















}
