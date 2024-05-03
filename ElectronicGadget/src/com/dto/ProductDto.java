package com.dto;

public class ProductDto {
     private int inventory_id;
     private double price;
     private double quantityInStock;
     private double inventoryValue;
	@Override
	public String toString() {
		return "ProductDto [inventory_id=" + inventory_id + ", price=" + price + ", quantityInStock=" + quantityInStock
				+ ", inventoryValue=" + inventoryValue + "]";
	}
	public int getInventory_id() {
		return inventory_id;
	}
	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantityInStock() {
		return quantityInStock;
	}
	public void setQuantityInStock(double quantityInStock) {
		this.quantityInStock = quantityInStock;
	}
	public double getInventoryValue() {
		return inventoryValue;
	}
	public void setInventoryValue(double inventoryValue) {
		this.inventoryValue = inventoryValue;
	}
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDto(int inventory_id, double price, double quantityInStock, double inventoryValue) {
		super();
		this.inventory_id = inventory_id;
		this.price = price;
		this.quantityInStock = quantityInStock;
		this.inventoryValue = inventoryValue;
	}
}
