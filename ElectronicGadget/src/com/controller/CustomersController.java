package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.exception.InvalidInputException;
import com.model.Customers;
import com.service.CustomersService;

public class CustomersController {

	public static void main(String[] args) {
		CustomersService customersService=new CustomersService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------Customer Operations-------------");
			System.out.println("Press 1. Display All Customers");
			System.out.println("Press 2. Total Orders By Customer");
			System.out.println("Press 3. Update Customer Details ");
			
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Customer Module..");
				break; 
			}
			switch(input){
			case 1:
				List<Customers> list;
				try {
					list = customersService.findAll();
					for(Customers c : list) {
						System.out.println(c);}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				try {
				List<Customers>list1 = customersService.findAll();
				for(Customers c : list1) {
					System.out.println(c);}
				System.out.println("Enter Customer Id");
				int Customer_id=sc.nextInt();
				
					int totalOrders=customersService.calculateTotalOrders(Customer_id);
					System.out.println(totalOrders);
				} catch (SQLException|InvalidInputException e) {
					System.out.println(e.getMessage());
				} 
				break;
			case 3:
				System.out.println("Enter Your Customer Id where you want to Update");
				int customer_id=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter First Name");
				String firstName=sc.nextLine();
				
				System.out.println("Enter Last Name");
				String lastName=sc.nextLine();
				
				System.out.println("Enter Email");
				String email=sc.nextLine();
				
				System.out.println("Enter Phone Number");
				String phoneNo=sc.nextLine();
			
				System.out.println("Enter Address");
				String address=sc.nextLine();
				Customers customer=new Customers(customer_id, firstName, lastName,email, phoneNo, address);
				int status;
				try {
					
					status=customersService.updateCustomer(customer);
					if(status==1)
						System.out.println("Customer updated...");
					else
						System.out.println("Updation failed...");
				} catch (SQLException|InvalidInputException e) {
					System.out.println(e.getMessage());
				} break;
			
			
			}
			
		
		}
sc.close();
}}
