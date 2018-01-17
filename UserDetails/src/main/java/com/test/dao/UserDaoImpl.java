package com.test.dao;

import org.springframework.stereotype.Repository;

import com.test.model.Login;
import com.test.model.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public boolean doLogin(Login login) {
		if(login.getUserName().equals("vishal") && login.getUserPass().equals("vishal"))
			return true;
		else
			return false;
	}

	@Override
	public boolean addUser(User user) {
		System.out.println("User added");
		return true;
	}

	@Override
	public boolean removeUser(User user) {
		System.out.println("User removed");
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		System.out.println("User updated");
		return true;
	}

	

}
