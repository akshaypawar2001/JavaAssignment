package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.InvalidInputException;
import com.model.Customers;
import com.utility.DBConnection;

public class CustomerDaoImpl implements CustomerDao{
	Customers customers=new Customers();

	@Override
	public int calculateTotalOrders(int Customer_id) throws SQLException, InvalidInputException {
		Connection con = DBConnection.dbConnect();
		String sql="select Quantity from OrderDetails where Order_id in "
				+ "(select Order_id from Orders where Customer_id in "
				+ "(select Customer_id from customers where Customer_id=?) )";
		PreparedStatement pstmt = con.prepareStatement(sql);
		      pstmt.setInt(1, Customer_id);
                ResultSet rst=pstmt.executeQuery();
				if(rst.next()==true) {
					int totalOrders=rst.getInt("Quantity");
					DBConnection.dbClose();	
				return totalOrders;}
				else {
					throw new InvalidInputException("Customer Id is not valid");
				}
		
	}

	@Override
	public List<Customers> findAll() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from customers";
		PreparedStatement pstmt = con.prepareStatement(sql);
		ResultSet rst = pstmt.executeQuery();
		List<Customers> list = new ArrayList<>();
		while(rst.next() == true) {
			int customer_id  = rst.getInt("customer_id");
			String firstName = rst.getString("firstName");
			String lastName = rst.getString("lastName");
			String email = rst.getString("email");
			String phone = rst.getString("phone");
			String address = rst.getString("address");
			Customers customers = new Customers( customer_id,  firstName,  lastName, email, phone,address) ; //100X 200X 300X
			list.add(customers);
		}
		DBConnection.dbClose();		
		return list;
	}

	@Override
	public int updateCustomer(Customers customer) throws SQLException, InvalidInputException {
		Connection con = DBConnection.dbConnect();
		String sql="update customers set FirstName=?,LastName=?,Email=?,Phone=?,Address=? where Customer_id=?;";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1,customer.getFirstName());
		pstmt.setString(2,customer.getLastName());
		pstmt.setString(3,customer.getEmail());
		pstmt.setString(4,customer.getPhone());
		pstmt.setString(5,customer.getAddress());
		pstmt.setInt(6,customer.getCustomer_id());
		
		int status=pstmt.executeUpdate();
		
		DBConnection.dbClose();	
		return status;
		
		
		
		
	}

}
