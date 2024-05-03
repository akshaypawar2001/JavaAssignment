package com.model;

public class OrderDetails {
	private int OrderDetail_id;
	private int Order_id;
	private int Product_id;
	private int Quantity;
	public OrderDetails(int orderDetail_id, int order_id, int product_id, int quantity) {
		super();
		OrderDetail_id = orderDetail_id;
		Order_id = order_id;
		Product_id = product_id;
		Quantity = quantity;
	}
	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrderDetail_id() {
		return OrderDetail_id;
	}
	public void setOrderDetail_id(int orderDetail_id) {
		OrderDetail_id = orderDetail_id;
	}
	public int getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(int order_id) {
		Order_id = order_id;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "OrderDetails [OrderDetail_id=" + OrderDetail_id + ", Order_id=" + Order_id + ", Product_id="
				+ Product_id + ", Quantity=" + Quantity + "]";
	}
}
