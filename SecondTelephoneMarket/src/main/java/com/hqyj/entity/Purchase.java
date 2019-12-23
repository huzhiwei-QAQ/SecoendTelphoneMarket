package com.hqyj.entity;

public class Purchase {
private int pc_id;
private String type;
private String supplier;
private int num;
public Purchase() {
	super();
	// TODO Auto-generated constructor stub
}
public Purchase(int pc_id, String type, String supplier, int num) {
	super();
	this.pc_id = pc_id;
	this.type = type;
	this.supplier = supplier;
	this.num = num;
}
public int getPc_id() {
	return pc_id;
}
public void setPc_id(int pc_id) {
	this.pc_id = pc_id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getSupplier() {
	return supplier;
}
public void setSupplier(String supplier) {
	this.supplier = supplier;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
@Override
public String toString() {
	return "Purchase [pc_id=" + pc_id + ", type=" + type + ", supplier=" + supplier + ", num=" + num + "]";
}


}
