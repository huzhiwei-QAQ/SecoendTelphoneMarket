package com.hqyj.entity;

public class Goods {
private int g_id;
private String g_type;
private String g_discription;
private double g_price;
private int g_num;
public Goods() {
	super();
	// TODO Auto-generated constructor stub
}
public Goods(int g_id, String g_type, String g_discription, double g_price, int g_num) {
	super();
	this.g_id = g_id;
	this.g_type = g_type;
	this.g_discription = g_discription;
	this.g_price = g_price;
	this.g_num = g_num;
}
public int getG_id() {
	return g_id;
}
public void setG_id(int g_id) {
	this.g_id = g_id;
}
public String getG_type() {
	return g_type;
}
public void setG_type(String g_type) {
	this.g_type = g_type;
}
public String getG_discription() {
	return g_discription;
}
public void setG_discription(String g_discription) {
	this.g_discription = g_discription;
}
public double getG_price() {
	return g_price;
}
public void setG_price(double g_price) {
	this.g_price = g_price;
}
public int getG_num() {
	return g_num;
}
public void setG_num(int g_num) {
	this.g_num = g_num;
}
@Override
public String toString() {
	return "Goods [g_id=" + g_id + ", g_type=" + g_type + ", g_discription=" + g_discription + ", g_price=" + g_price
			+ ", g_num=" + g_num + "]";
}


}
