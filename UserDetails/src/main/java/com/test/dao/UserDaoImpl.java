package com.test.dao;


import org.springframework.stereotype.Repository;

import com.test.model.Login;

@Repository
public class UserDaoImpl implements UserDao {

	
	@Override
	public boolean validateUser(Login login) {
		if(login.getUserName().equals("vaibhav")&&login.getPassword().equals("abc"))
			return true;
		return false;
	} 
	

}
