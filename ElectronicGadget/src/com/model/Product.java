package com.model;

public class Product {
	private int Product_id;
	private String ProductName;
	private String Description;
	private int Price;
	public Product() {
		
	}
	@Override
	public String toString() {
		return "Product [Product_id=" + Product_id + ", ProductName=" + ProductName + ", Description=" + Description
				+ ", Price=" + Price + "]";
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public Product(int product_id, String productName, String description, int price) {
		super();
		Product_id = product_id;
		ProductName = productName;
		Description = description;
		Price = price;
	}

}
