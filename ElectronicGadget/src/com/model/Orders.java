package com.model;

public class Orders {
	private int Order_id;
	private int Customer_id;
	private String OrderDate;
	private double TotalAmount;
	@Override
	public String toString() {
		return "Orders [Order_id=" + Order_id + ", Customer_id=" + Customer_id + ", OrderDate=" + OrderDate
				+ ", TotalAmount=" + TotalAmount + "]";
	}
	public int getOrder_id() {
		return Order_id;
	}
	public void setOrder_id(int order_id) {
		Order_id = order_id;
	}
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public String getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(String orderDate) {
		OrderDate = orderDate;
	}
	public double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Orders(int order_id, int customer_id, String orderDate, double totalAmount) {
		super();
		Order_id = order_id;
		Customer_id = customer_id;
		OrderDate = orderDate;
		TotalAmount = totalAmount;
	}
}
