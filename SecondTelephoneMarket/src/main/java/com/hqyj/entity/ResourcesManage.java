package com.hqyj.entity;

public class ResourcesManage {
private int id;
private String type;
private String supplier;
private Double purchaseprice;
private Double sellingprice;
private String path;
private String discription;

public ResourcesManage(){
	
}

public ResourcesManage(int id, String type, String supplier, Double purchasePrice, Double sellingPrice, String path,
		String discription) {
	super();
	this.id = id;
	this.type = type;
	this.supplier = supplier;
	this.purchaseprice = purchasePrice;
	this.sellingprice = sellingPrice;
	this.path = path;
	this.discription = discription;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
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

public Double getPurchasePrice() {
	return purchaseprice;
}

public void setPurchasePrice(Double purchasePrice) {
	this.purchaseprice = purchasePrice;
}

public Double getSellingPrice() {
	return sellingprice;
}

public void setSellingPrice(Double sellingPrice) {
	this.sellingprice = sellingPrice;
}

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}

public String getDiscription() {
	return discription;
}

public void setDiscription(String discription) {
	this.discription = discription;
}

@Override
public String toString() {
	return "ResourcesManage [id=" + id + ", type=" + type + ", supplier=" + supplier + ", purchasePrice="
			+ purchaseprice + ", sellingPrice=" + sellingprice + ", path=" + path + ", discription=" + discription
			+ "]";
}

}
