package com.model;

public class Customers {
	private int Customer_id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String Phone;
	private String Address;
	public Customers() {
		
	}
	@Override
	public String toString() {
		return "Customers [Customer_id=" + Customer_id + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Email=" + Email + ", Phone=" + Phone + ", Address=" + Address + "]";
	}
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Customers(int customer_id, String firstName, String lastName, String email, String phone, String address) {
		super();
		Customer_id = customer_id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		Phone = phone;
		Address = address;
	}
	
	

}
