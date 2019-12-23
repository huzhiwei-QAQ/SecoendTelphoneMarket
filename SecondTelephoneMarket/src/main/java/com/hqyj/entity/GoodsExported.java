package com.hqyj.entity;

public class GoodsExported {
private int ge_id;
private String type;
private int num;
public GoodsExported() {
	super();
	// TODO Auto-generated constructor stub
}
public GoodsExported(int ge_id, String type, int num) {
	super();
	this.ge_id = ge_id;
	this.type = type;
	this.num = num;
}
public int getGe_id() {
	return ge_id;
}
public void setGe_id(int ge_id) {
	this.ge_id = ge_id;
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
	return "GoodsExported [ge_id=" + ge_id + ", type=" + type + ", num=" + num + "]";
}


}