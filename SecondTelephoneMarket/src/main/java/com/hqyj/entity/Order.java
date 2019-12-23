package com.hqyj.entity;

public class Order {
private int o_id;
private String name;
private String type;
private int num;
public Order() {
	super();
	// TODO Auto-generated constructor stub
}

public int getO_id() {
	return o_id;
}
public void setO_id(int o_id) {
	this.o_id = o_id;
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
	return "Order [o_id=" + o_id + ", name=" + name + ", type=" + type + ", num=" + num + "]";
}

}
