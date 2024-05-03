package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.exception.InvalidInputException;
import com.model.Customers;

public class CustomersService {
	CustomerDao dao=new CustomerDaoImpl() ;
		
	

	public List<Customers> findAll() throws SQLException {
		
		return dao.findAll();
	}



	public int calculateTotalOrders(int customer_id) throws SQLException, InvalidInputException {
		
		return dao.calculateTotalOrders(customer_id);
	}



	public int updateCustomer(Customers customer) throws SQLException, InvalidInputException {
		return dao.updateCustomer(customer);
		
	}


}