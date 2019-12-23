package com.hqyj.entity;



public class PurchaseOrders {
private int po_id;
private String type;
private int num;
private String supplier;
public PurchaseOrders() {
	super();
	// TODO Auto-generated constructor stub
}

public PurchaseOrders(int po_id, String type, int num, String supplier) {
	super();
	this.po_id = po_id;
	this.type = type;
	this.num = num;
	this.supplier = supplier;
}

public int getPo_id() {
	return po_id;
}
public void setPo_id(int po_id) {
	this.po_id = po_id;
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

public String getSupplier() {
	return supplier;
}

public void setSupplier(String supplier) {
	this.supplier = supplier;
}

@Override
public String toString() {
	return "PurchaseOrders [po_id=" + po_id + ", type=" + type + ", num=" + num + ", supplier=" + supplier + "]";
}




}
