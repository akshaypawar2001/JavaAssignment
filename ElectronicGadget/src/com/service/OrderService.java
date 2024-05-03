package com.service;

import java.sql.SQLException;

import com.dao.OrderDao;
import com.dao.OrderDaoImpl;
import com.exception.InvalidInputException;

public class OrderService {
   OrderDao dao=new OrderDaoImpl();
   public double calculateTotalamount(int order_id) throws SQLException, InvalidInputException {
		return dao.calculateTotalamount(order_id);
	}

}
