package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.InventoryDao;
import com.dao.InventoryDaoImpl;
import com.dto.InventoryDto;
import com.exception.InvalidInputException;


public class InventoryService {
 
	
	InventoryDao dao=new InventoryDaoImpl();
	public int getQuantityOfStock(int product_id) throws SQLException, InvalidInputException {
		boolean isIdValid = dao.findOne(product_id);
		if(!isIdValid)
			throw new InvalidInputException("Id given is Invalid!!");
		return dao.getQuantityOfStock(product_id);
	}
	public boolean isProductAvailable(int product_id1, int quantityToCheck) throws SQLException, InvalidInputException {
		boolean isIdValid = dao.findOne(product_id1);
		if(!isIdValid)
			throw new InvalidInputException("Id given is Invalid!!");
		return dao.isProductAvailable(product_id1, quantityToCheck);
		
	}
	public  List<InventoryDto> listOutOfStockProducts() throws SQLException {
		return dao.listOutOfStockProducts();
	}
	public double getInventoryValue(int inventory_id) throws SQLException, InvalidInputException {
		return dao.getInventoryValue(inventory_id);
	}

}
