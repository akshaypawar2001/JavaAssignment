package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.InventoryDto;
import com.exception.InvalidInputException;

import com.model.Inventory;
import com.utility.DBConnection;

public class InventoryDaoImpl implements InventoryDao {

	@Override
	public int getQuantityOfStock(int product_id) throws SQLException, InvalidInputException {
		Connection con = DBConnection.dbConnect();
		String sql="select QuantityInStock from inventory where Product_id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		      pstmt.setInt(1, product_id);
                ResultSet rst=pstmt.executeQuery();
				if(rst.next()==true) {
					int getQuantity=rst.getInt("QuantityInStock");
					DBConnection.dbClose();	
				return getQuantity;}
				else {
					throw new InvalidInputException("Product Id is not valid");
				}
	}

	@Override
	public boolean isProductAvailable(int product_id, int quantityToCheck) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select QuantityInStock from inventory where Product_id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, product_id);
		ResultSet rst=pstmt.executeQuery();
		
		if(rst.next()==true && rst.getInt("quantityInStock")>quantityToCheck )
			{DBConnection.dbClose();	
			return true;}
			 else
		      return false;
			
		 }
	public Boolean findOne(int Product_id) throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select Product_id from inventory where Product_id=?";
		//prepare the statement 
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, Product_id);
		ResultSet rst  = pstmt.executeQuery();
		boolean status = rst.next(); //true / false
		DBConnection.dbClose();
		return status;
	}

	@Override
	public List<InventoryDto> listOutOfStockProducts() throws SQLException {
		Connection con = DBConnection.dbConnect();
		String sql="select i.Inventory_id,i.Product_id,p.ProductName from inventory i "
				+ "join Products p on p.Product_id=i.Product_id where QuantityInStock=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, 0);
		ResultSet rst = pstmt.executeQuery();
		List<InventoryDto> list = new ArrayList<>();
		while(rst.next() == true) {
			int inventory_id  = rst.getInt("inventory_id");
			int product_id  = rst.getInt("product_id");
			String product_name = rst.getString("productName");
			InventoryDto dto=new InventoryDto(inventory_id,product_id,product_name);	
			list.add(dto);}
		DBConnection.dbClose();
		return list;
			
		}

	@Override
	public double getInventoryValue(int inventory_id) throws SQLException, InvalidInputException {
		Connection con = DBConnection.dbConnect();
		String sql="select p.Price,i.QuantityInStock from inventory i join"
				+ " Products p on i.Product_id=p.Product_id where Inventory_id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,inventory_id);
		double totalInventoryValue;
		ResultSet rst  = pstmt.executeQuery();
		if(rst.next() == true) {
			int price=rst.getInt("Price");
			double QuantityInStock=rst.getDouble("QuantityInStock");
			totalInventoryValue=price*QuantityInStock;
			return totalInventoryValue;}
		else
			throw new InvalidInputException("Invalid inventory Id");
	}
	}	


		
	

	
	
	


