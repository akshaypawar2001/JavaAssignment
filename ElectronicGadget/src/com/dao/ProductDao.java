package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.ProductDto;
import com.exception.InvalidInputException;

import com.model.Product;

public interface ProductDao {

	List<Product> getProductDetailsById(int product_id)throws SQLException,InvalidInputException;
	boolean findOne(int Product_id)throws SQLException,InvalidInputException;
	List<Product> getProduct(int Inventory_id)throws SQLException,InvalidInputException;
	boolean isValid(int Inventory_id)throws SQLException,InvalidInputException;
 
}
