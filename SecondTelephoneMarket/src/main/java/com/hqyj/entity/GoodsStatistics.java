package com.hqyj.entity;

public class GoodsStatistics {
private int gs_id;
private String type;
private String discription;
private double price;
private int num;
private double priceall;
public GoodsStatistics() {
	super();
	// TODO Auto-generated constructor stub
}

public GoodsStatistics(int gs_id, String type, String discription, double price, int num, double priceall) {
	super();
	this.gs_id = gs_id;
	this.type = type;
	this.discription = discription;
	this.price = price;
	this.num = num;
	this.priceall = priceall;
}

public int getGs_id() {
	return gs_id;
}
public void setGs_id(int gs_id) {
	this.gs_id = gs_id;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}

public double getPriceall() {
	return priceall;
}

public void setPriceall(double priceall) {
	this.priceall = priceall;
}

@Override
public String toString() {
	return "GoodsStatistics [gs_id=" + gs_id + ", type=" + type + ", discription=" + discription + ", price=" + price
			+ ", num=" + num + ", priceall=" + priceall + "]";
}



}
