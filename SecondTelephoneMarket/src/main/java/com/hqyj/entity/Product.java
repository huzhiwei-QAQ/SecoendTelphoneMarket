package com.hqyj.entity;

public class Product {
private int p_id;
private String p_type;
private String p_discription;
private int p_num;
private String p_url;
private double p_price;
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int p_id, String p_type, String p_discription, int p_num, String p_url, double p_price) {
	super();
	this.p_id = p_id;
	this.p_type = p_type;
	this.p_discription = p_discription;
	this.p_num = p_num;
	this.p_url = p_url;
	this.p_price = p_price;
}
public int getP_id() {
	return p_id;
}
public void setP_id(int p_id) {
	this.p_id = p_id;
}
public String getP_type() {
	return p_type;
}
public void setP_type(String p_type) {
	this.p_type = p_type;
}
public String getP_discription() {
	return p_discription;
}
public void setP_discription(String p_discription) {
	this.p_discription = p_discription;
}
public int getP_num() {
	return p_num;
}
public void setP_num(int p_num) {
	this.p_num = p_num;
}
public String getP_url() {
	return p_url;
}
public void setP_url(String p_url) {
	this.p_url = p_url;
}
public double getP_price() {
	return p_price;
}
public void setP_price(double p_price) {
	this.p_price = p_price;
}
@Override
public String toString() {
	return "Product [p_id=" + p_id + ", p_type=" + p_type + ", p_discription=" + p_discription + ", p_num=" + p_num
			+ ", p_url=" + p_url + ", p_price=" + p_price + "]";
}


}
