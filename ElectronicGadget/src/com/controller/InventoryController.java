package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.InventoryDto;
import com.exception.InvalidInputException;
import com.service.InventoryService;

public class InventoryController {

	public static void main(String[] args) {
		InventoryService inventoryService=new InventoryService();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------Inventory Operations-------------");
			System.out.println("Press 1.  Get Quantity Of Stock");
			System.out.println("Press 2.  To Check Is Product Available Or Not");
			System.out.println("Press 3.  List of Product that are out of Stock");
			System.out.println("Press 4.  Get The Total Inventory Value");
			System.out.println("Press 0. to Exit");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("Exiting Customer Module..");
				break; 
			}
			switch(input) {
			case 1:
				System.out.println("Enter Product ID");
				int product_id=sc.nextInt();
				 int quantityInStock;
				try {
					quantityInStock = inventoryService.getQuantityOfStock(product_id);
					System.out.println(quantityInStock);
				} catch (SQLException| InvalidInputException e) {
					System.out.println(e.getMessage());
				} break;
			case 2:
				System.out.println("Enter Product ID");
				int product_id1=sc.nextInt();
				System.out.println("Enter Quantity to check");
				int quantityToCheck=sc.nextInt();
			  
				try {
					boolean isAvailable= inventoryService.isProductAvailable(product_id1,quantityToCheck);
					System.out.println(isAvailable);
				} catch (SQLException | InvalidInputException e) {
					System.out.println(e.getMessage());
				}break;
			case 3:
				 List<InventoryDto> list;
				try {
					list = inventoryService.listOutOfStockProducts();
					 for(InventoryDto i:list) {
						 System.out.println(i);}
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter Inventory Id");
				int inventory_id=sc.nextInt();
				try {
					double totalInventoryValue=inventoryService.getInventoryValue(inventory_id);
					System.out.println(totalInventoryValue);
				} catch (SQLException|InvalidInputException e) {
					System.out.println(e.getMessage());
				
				}
				
			
			
			}

	}
	}
}
