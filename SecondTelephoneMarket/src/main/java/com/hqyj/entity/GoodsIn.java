package com.hqyj.entity;

public class GoodsIn {
private int gi_id;
private String type;
private int num;
public GoodsIn() {
	super();
	// TODO Auto-generated constructor stub
}
public GoodsIn(int gi_id, String type, int num) {
	super();
	this.gi_id = gi_id;
	this.type = type;
	this.num = num;
}
public int getGi_id() {
	return gi_id;
}
public void setGi_id(int gi_id) {
	this.gi_id = gi_id;
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
	return "GoodsIn [gi_id=" + gi_id + ", type=" + type + ", num=" + num + "]";
}


}
