package com.dto;

public class InventoryDto {
private int inventory_id;
private int product_id;
private String product_name;
@Override
public String toString() {
	return "InventoryDto [inventory_id=" + inventory_id + ", product_id=" + product_id + ", product_name="
			+ product_name + "]";
}
public int getInventory_id() {
	return inventory_id;
}
public void setInventory_id(int inventory_id) {
	this.inventory_id = inventory_id;
}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public String getProduct_name() {
	return product_name;
}
public void setProduct_name(String product_name) {
	this.product_name = product_name;
}
public InventoryDto() {
	super();
	// TODO Auto-generated constructor stub
}
public InventoryDto(int inventory_id, int product_id, String product_name) {
	super();
	this.inventory_id = inventory_id;
	this.product_id = product_id;
	this.product_name = product_name;
}
}
