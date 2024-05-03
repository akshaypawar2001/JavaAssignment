package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exception.InvalidInputException;
import com.model.Inventory;
import com.model.Product;
import com.utility.DBConnection;

public class ProductDaoImpl implements ProductDao {

	

	@Override
	public List<Product> getProductDetailsById(int product_id) throws SQLException, InvalidInputException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from Products where Product_id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, product_id);
		ResultSet rst = pstmt.executeQuery();
		List<Product> list = new ArrayList<>();
		while(rst.next() == true) {
			
			String productName= rst.getString("productName");
			String description = rst.getString("description");
			int price = rst.getInt("price");
			Product product = new Product( product_id, productName, description,  price); //100X 200X 300X
			list.add(product);
		}
		DBConnection.dbClose();		
		return list;
	}

	@Override
	public boolean findOne(int Product_id) throws SQLException, InvalidInputException {
		Connection con = DBConnection.dbConnect();
		String sql="select Product_id from inventory where Product_id=? ";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,Product_id);
		ResultSet rst  = pstmt.executeQuery();
		boolean status = rst.next(); //true / false
		DBConnection.dbClose();
		return status;
	}

	@Override
	public List<Product> getProduct(int Inventory_id) throws SQLException, InvalidInputException {
		Connection con = DBConnection.dbConnect();
		String sql="select * from Products where Product_id in (select Product_id from inventory where Inventory_id=?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,Inventory_id);
		ResultSet rst = pstmt.executeQuery();
		List<Product> list = new ArrayList<>();
		while(rst.next() == true) {
			int product_id = rst.getInt("product_id");
            String productName= rst.getString("productName");
			String description = rst.getString("description");
			int price = rst.getInt("price");
			Product product = new Product(product_id, productName, description,price); //100X 200X 300X
			list.add(product);
		}
		DBConnection.dbClose();		
		return list;
	}

	@Override
	public boolean isValid(int Inventory_id) throws SQLException, InvalidInputException {
		Connection con = DBConnection.dbConnect();
		String sql="select Inventory_id from inventory where Inventory_id=?";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,Inventory_id);
		ResultSet rst  = pstmt.executeQuery();
		boolean status = rst.next(); //true / false
		DBConnection.dbClose();
		return status;
	}

		
		
	

}
