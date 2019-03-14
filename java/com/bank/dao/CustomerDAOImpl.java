package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bank.dto.CustomerDetails1;

public class CustomerDAOImpl implements CustomerDAO {
	public CustomerDetails1 customerDetails(CustomerDetails1 customer) throws Exception  {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Manasa", "Manasa33");
		Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from product");
				while(rs.next())   
				System.out.println(rs.getLong(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "
				+rs.getString(4)+" "+rs.getLong(5)+rs.getLong(6)+rs.getLong(7)
				+rs.getString(8)+rs.getLong(9)+rs.getLong(10));  
				con.close();
		return customer;
		
	}
}
