package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.exception.InvalidInputException;
import com.utility.DBConnection;

public class OrderDaoImpl implements OrderDao{

	@Override
	public double calculateTotalamount(int order_id) throws SQLException, InvalidInputException {
		Connection con = DBConnection.dbConnect();
		String sql="select TotalAmount from Orders where Order_id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,order_id);
		ResultSet rst = pstmt.executeQuery();
		if(rst.next()==true) {
			double totalAmount=rst.getDouble("TotalAmount");
		DBConnection.dbClose();	
		return totalAmount;
	}
		else {
			throw new InvalidInputException("Order Id is not valid");
		}


}}
