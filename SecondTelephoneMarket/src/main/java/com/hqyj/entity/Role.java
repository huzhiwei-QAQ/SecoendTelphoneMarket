package com.hqyj.entity;

public class Role {
private int r_id;
private String roles;
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
public Role(int r_id, String roles) {
	super();
	this.r_id = r_id;
	this.roles = roles;
}
public int getR_id() {
	return r_id;
}
public void setR_id(int r_id) {
	this.r_id = r_id;
}
public String getRoles() {
	return roles;
}
public void setRoles(String roles) {
	this.roles = roles;
}
@Override
public String toString() {
	return "Role [r_id=" + r_id + ", roles=" + roles + "]";
}


}
