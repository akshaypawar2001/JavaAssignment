package com.model;

public class Inventory {
	private int Inventory_id;
	private int Product_id;
	private int QuantityInStock;
	private int LastStockUpdate;
	public Inventory() {
	
	}
	@Override
	public String toString() {
		return "Inventory [Inventory_id=" + Inventory_id + ", Product_id=" + Product_id + ", QuantityInStock="
				+ QuantityInStock + ", LastStockUpdate=" + LastStockUpdate + "]";
	}
	public int getInventory_id() {
		return Inventory_id;
	}
	public void setInventory_id(int inventory_id) {
		Inventory_id = inventory_id;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public int getQuantityInStock() {
		return QuantityInStock;
	}
	public void setQuantityInStock(int quantityInStock) {
		QuantityInStock = quantityInStock;
	}
	public int getLastStockUpdate() {
		return LastStockUpdate;
	}
	public void setLastStockUpdate(int lastStockUpdate) {
		LastStockUpdate = lastStockUpdate;
	}
	public Inventory(int inventory_id, int product_id, int quantityInStock, int lastStockUpdate) {
		super();
		Inventory_id = inventory_id;
		Product_id = product_id;
		QuantityInStock = quantityInStock;
		LastStockUpdate = lastStockUpdate;
	}
}
