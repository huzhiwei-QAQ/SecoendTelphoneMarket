package com.hqyj.entity;

public class ProductSaled {
private int ps_id;
private String type;
private String discription;
private int num;
private double price;
private double priceall;
public ProductSaled() {
	super();
	// TODO Auto-generated constructor stub
}

public ProductSaled(int ps_id, String type, String discription, int num, double price, double priceall) {
	super();
	this.ps_id = ps_id;
	this.type = type;
	this.discription = discription;
	this.num = num;
	this.price = price;
	this.priceall = priceall;
}

public int getPs_id() {
	return ps_id;
}
public void setPs_id(int ps_id) {
	this.ps_id = ps_id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getDiscription() {
	return discription;
}
public void setDiscription(String discription) {
	this.discription = discription;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public double getPriceall() {
	return priceall;
}

public void setPriceall(double priceall) {
	this.priceall = priceall;
}

@Override
public String toString() {
	return "ProductSaled [ps_id=" + ps_id + ", type=" + type + ", discription=" + discription + ", num=" + num
			+ ", price=" + price + ", priceall=" + priceall + "]";
}




}
