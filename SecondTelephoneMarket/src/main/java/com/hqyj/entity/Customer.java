package com.hqyj.entity;

public class Customer {
private int c_id;
private String name;
private String type;
private int num;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int c_id, String name, String type, int num) {
	super();
	this.c_id = c_id;
	this.name = name;
	this.type = type;
	this.num = num;
}
public int getC_id() {
	return c_id;
}
public void setC_id(int c_id) {
	this.c_id = c_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
@Override
public String toString() {
	return "Customer [c_id=" + c_id + ", name=" + name + ", type=" + type + ", num=" + num + "]";
}


}
