package com.dao;

import java.sql.SQLException;

import com.exception.InvalidInputException;

public interface OrderDao {
	double calculateTotalamount(int order_id) throws SQLException,InvalidInputException;

}
