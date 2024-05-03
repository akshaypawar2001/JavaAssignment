package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.dto.InventoryDto;
import com.exception.InvalidInputException;
import com.model.Inventory;

public interface InventoryDao {
	int getQuantityOfStock(int product_id)throws SQLException,InvalidInputException;
	boolean isProductAvailable(int product_id,int quantityToCheck)throws SQLException;
	public Boolean findOne(int Product_id) throws SQLException ;
	List<InventoryDto> listOutOfStockProducts()throws SQLException ;
	  double  getInventoryValue(int inventory_id)throws SQLException,InvalidInputException;

}
