package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.model.User;

@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
	DBConnection dbCon;

	@Override
	public boolean validateUser(String uName, String uPass) {
		try {
			Connection con = dbCon.getConnection();
			if(con == null){
				System.out.println("Connection failed");
				return false;
			}
			
			String query = "select userName, uPassword from user where userName = '"+uName+"' AND uPassword = '"+uPass+"'";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(!rs.isBeforeFirst()) {
				rs.close();
				con.close();
				return false;
			}else {
				rs.close();
				con.close();
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean addUser(User u) {
		try {
			Connection con = dbCon.getConnection();
			if(con == null){
				System.out.println("Connection failed");
				return false;
			}
			
			PreparedStatement stmt = con.prepareStatement("insert into user(userName,uName,uGender,"
					+ "uPassword,uEmail,uMobile,uLevel,uPoints) values(?,?,?,?,?,?,?,?)");
			stmt.setString(1, u.getuName());
			stmt.setString(2, u.getuName());
			stmt.setString(3, u.getuGender());
			stmt.setString(4, u.getuPassword());
			stmt.setString(5, u.getuEmail());
			stmt.setInt(6, Integer.parseInt(u.getuMobile()));
			stmt.setString(7, "Beginner");
			stmt.setInt(8, 0);
			int count = stmt.executeUpdate();
			if(count > 0) {
				con.close();
				return true;
			}else {
				con.close();
				return false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	


}
