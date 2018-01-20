package com.test.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.test.model.Login;
import com.test.model.User1;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public boolean doLogin(Login login) {
		if(login.getUserName().equals("v") && login.getUserPass().equals("v"))
			return true;
		else
			return false;
	}

	@Override
	@Transactional
	public boolean addUser(User1 user) {
		
		System.out.println("aalo");
		System.out.println(sessionFactory==null);
		sessionFactory.getCurrentSession().save(user);
		System.out.println("User added");
		return true;
	}

	@Override
	@Transactional
	public boolean removeUser(User1 user) {
		System.out.println("User removed");
		return true;
	}

	@Override
	@Transactional
	public boolean updateUser(User1 user) {
		System.out.println("User updated");
		return true;
	}

	

}
