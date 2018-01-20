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
	public boolean validateUserName(Login login) {
		if(login.getUserName()==null||login.getUserName().length()==0)
		{
			return false;
		}
		return true;
	}


	@Override
	public boolean validatepassword(Login login) {
		if(login.getPassword()==null||login.getPassword().length()==0)
		{
			return false;
		}
		return true;
	}

	@Override
	public boolean validateUser(Login login) {
		if(userDao.validateUser(login))
			return true;
		else
			return false;
	}

}


