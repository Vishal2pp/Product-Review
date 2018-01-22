package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.LoginDao;
import com.product.model.User;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	LoginDao loginDao;
	@Override
	public boolean validateUser(String uName, String uPass) {
		return loginDao.validateUser(uName, uPass);
	}
	@Override
	public boolean addUser(User u) {
		return loginDao.addUser(u);
	}

}
