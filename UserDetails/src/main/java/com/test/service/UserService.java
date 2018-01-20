package com.test.service;

import com.test.model.Login;
import com.test.model.User1;

public interface UserService {
	public boolean doLogin(Login login);
	public boolean addUser(User1 user);
	public boolean removeUser(User1 user);
	public boolean updateUser(User1 user);
}
