package com.hqyj.entity;

public class Supplier {
private int s_id;
private String suppliers;
private String address;
public Supplier() {
	super();
	// TODO Auto-generated constructor stub
}
public Supplier(int s_id, String suppliers, String address) {
	super();
	this.s_id = s_id;
	this.suppliers = suppliers;
	this.address = address;
}
public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public String getSuppliers() {
	return suppliers;
}
public void setSuppliers(String suppliers) {
	this.suppliers = suppliers;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Supplier [s_id=" + s_id + ", suppliers=" + suppliers + ", address=" + address + "]";
}


}
