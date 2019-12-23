package com.hqyj.entity;

public class User {
private int u_id;
private String username;
private String password;
private Role role;
public User() {
	super();
	// TODO Auto-generated constructor stub
}





public User(int u_id, String username, String password, Role role) {
	super();
	this.u_id = u_id;
	this.username = username;
	this.password = password;
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





@Override
public String toString() {
	return "User [u_id=" + u_id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
}










}
