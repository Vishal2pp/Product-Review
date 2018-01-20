package com.test.dao;

import com.test.model.Login;
import com.test.model.User1;

public interface UserDao {
	public boolean doLogin(Login login);
	public boolean addUser(User1 user);
	public boolean removeUser(User1 user);
	public boolean updateUser(User1 user);
}
