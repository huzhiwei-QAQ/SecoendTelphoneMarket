package com.hqyj.entity;

public class NewUser {
private int nu_id;
private String name;
private String password;
private String email;
private String roles;
public NewUser() {
	super();
	// TODO Auto-generated constructor stub
}

public NewUser(int nu_id, String name, String password, String email, String roles) {
	super();
	this.nu_id = nu_id;
	this.name = name;
	this.password = password;
	this.email = email;
	this.roles = roles;
}

public int getNu_id() {
	return nu_id;
}
public void setNu_id(int nu_id) {
	this.nu_id = nu_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRoles() {
	return roles;
}
public void setRoles(String roles) {
	this.roles = roles;
}


public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "NewUser [nu_id=" + nu_id + ", name=" + name + ", password=" + password + ", email=" + email + ", roles="
			+ roles + "]";
}




}
