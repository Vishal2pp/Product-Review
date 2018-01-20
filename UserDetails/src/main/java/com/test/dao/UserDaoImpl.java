package com.test.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Login;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public boolean validateUser(Login login) {
		if(login.getUserName().equals("vaibhav")&&login.getPassword().equals("abc"))
			return true;
		return false;
	} 
	

}
