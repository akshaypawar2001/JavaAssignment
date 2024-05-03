package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.ProductDao;
import com.dao.ProductDaoImpl;
import com.exception.InvalidInputException;
import com.model.Product;

public class ProductService {
	ProductDao dao=new ProductDaoImpl();
	
	

	public List<Product> getProductDetailsById(int product_id1) throws SQLException, InvalidInputException {
		boolean isProductIdValid=dao.findOne(product_id1);
		if(!isProductIdValid)
			throw new InvalidInputException("Invalid Product Id");
		
		return dao.getProductDetailsById(product_id1);
	}

	public List<Product> getProduct(int inventory_id) throws InvalidInputException, SQLException {
		boolean isInventoryIdValid=dao.isValid(inventory_id);
		if(!isInventoryIdValid)
			throw new InvalidInputException("Invalid inventory Id");
		
		return dao.getProduct(inventory_id);
	}

	

}
