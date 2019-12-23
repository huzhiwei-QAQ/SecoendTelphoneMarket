package com.hqyj.entity;

public class Authority {
private int a_id;
private String authoritys;
private String authoritys_url;
public Authority() {
	super();
	// TODO Auto-generated constructor stub
}

public Authority(int a_id, String authoritys, String authoritys_url) {
	super();
	this.a_id = a_id;
	this.authoritys = authoritys;
	this.authoritys_url = authoritys_url;
}

public int getA_id() {
	return a_id;
}
public void setA_id(int a_id) {
	this.a_id = a_id;
}
public String getAuthoritys() {
	return authoritys;
}
public void setAuthoritys(String authoritys) {
	this.authoritys = authoritys;
}

public String getAuthoritys_url() {
	return authoritys_url;
}

public void setAuthoritys_url(String authoritys_url) {
	this.authoritys_url = authoritys_url;
}

@Override
public String toString() {
	return "Authority [a_id=" + a_id + ", authoritys=" + authoritys + ", authoritys_url=" + authoritys_url + "]";
}


}
