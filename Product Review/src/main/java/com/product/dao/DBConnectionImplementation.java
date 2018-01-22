package com.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

@Repository
public class DBConnectionImplementation implements DBConnection {
	Connection con = null;
	@Override
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");  
			return con;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}  
		return con;
	}

}
