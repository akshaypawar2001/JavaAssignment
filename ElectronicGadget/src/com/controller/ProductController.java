package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.exception.InvalidInputException;
import com.model.Product;
import com.service.ProductService;

public class ProductController {
	public static void main(String[]args) {
	ProductService productService=new ProductService();
    Scanner sc = new Scanner(System.in);
while(true) {
	System.out.println("----------Product Operations-------------");
	
	System.out.println("Press 1. Get Product Details By Product Id");
	System.out.println("Press 2. Get Product Associated with Inventory Id");
	System.out.println("Press 0. to Exit");
	int input = sc.nextInt();
	if(input == 0) {
		System.out.println("Exiting Product Module..");
		break; 
	}
	switch(input){
	case 1:
		System.out.println("Enter Product Id");
		int product_id1=sc.nextInt();
		try {
			List<Product> list=productService.getProductDetailsById(product_id1);
			for(Product p:list) {
				System.out.println(p);
			}
		} catch (SQLException|InvalidInputException e) {
			System.out.println(e.getMessage());
		} 
		break;
	case 2:
		System.out.println("Enter Inventory Id");
		int Inventory_id=sc.nextInt();
		try {
			List<Product> list=productService.getProduct(Inventory_id);
			for(Product p:list) {
				System.out.println(p);
			}
		} catch (SQLException|InvalidInputException e) {
			System.out.println(e.getMessage());
		} 
	
	
	  }
}
sc.close();
}}