package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.exception.InvalidInputException;
import com.service.OrderService;

public class OrderController {

	public static void main(String[] args) {
		OrderService orderService=new OrderService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------Customer Operations-------------");
			System.out.println("Press 1. Display Total Amount Of Order");
			
			
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Order Module..");
				break; 
			}
			switch(input){
			case 1:
				System.out.println("Enter Order Id");
				int order_id=sc.nextInt();
				try {
					double totalAmount=orderService.calculateTotalamount(order_id);
					System.out.println(totalAmount);
				} catch (SQLException|InvalidInputException e) {
					System.out.println(e.getMessage());
				} 
				
				
			
			
			
			
			}}
	}

}
