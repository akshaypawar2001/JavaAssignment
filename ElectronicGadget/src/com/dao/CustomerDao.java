package com.dao;
import java.sql.SQLException;
import java.util.List;

import com.exception.InvalidInputException;
import com.model.Customers;





public interface CustomerDao{
	int calculateTotalOrders(int Customer_id) throws SQLException, InvalidInputException;
	List<Customers> findAll() throws SQLException;
     int updateCustomer(Customers customer)throws SQLException, InvalidInputException;
	

}
