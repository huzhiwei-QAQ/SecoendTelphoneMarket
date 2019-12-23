package com.hqyj.entity;

import java.sql.Date;



public class Notice {
private int n_id;
private String notices;
private Date time;
private String url;
public Notice() {
	super();
	// TODO Auto-generated constructor stub
}
public Notice(int n_id, String notices, Date time, String url) {
	super();
	this.n_id = n_id;
	this.notices = notices;
	this.time = time;
	this.url = url;
}
public int getN_id() {
	return n_id;
}
public void setN_id(int n_id) {
	this.n_id = n_id;
}
public String getNotices() {
	return notices;
}
public void setNotices(String notices) {
	this.notices = notices;
}
public Date getTime() {
	return time;
}
public void setTime(Date time) {
	this.time = time;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
@Override
public String toString() {
	return "Notice [n_id=" + n_id + ", notices=" + notices + ", time=" + time + ", url=" + url + "]";
}


}
