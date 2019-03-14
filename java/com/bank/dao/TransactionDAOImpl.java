package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bank.dto.CustomerDetails1;
import com.bank.dto.TransactionDetails;
public class TransactionDAOImpl implements TransactionDAO {
	public TransactionDetails transactionDetails(TransactionDetails transaction) throws Exception  {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Manasa", "Manasa33");
		Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from transaction_details");
				while(rs.next())   
				System.out.println(rs.getLong(1)+"  "+rs.getLong(2)+"  "+rs.getLong(3)+" "
				+rs.getDouble(4));  
				con.close();
		return transaction;
		
	}
}