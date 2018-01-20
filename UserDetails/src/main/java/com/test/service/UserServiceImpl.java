package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.dao.UserDao;
import com.test.model.Login;
import com.test.model.User1;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;
	
	@Override
	public boolean doLogin(Login login) {
		return userDao.doLogin(login);
	}

	@Override
	public boolean addUser(User1 user) {
		return userDao.addUser(user);
	}

	@Override
	public boolean removeUser(User1 user) {
		return userDao.removeUser(user);
	}

	@Override
	public boolean updateUser(User1 user) {
		return userDao.updateUser(user);
	}

}
