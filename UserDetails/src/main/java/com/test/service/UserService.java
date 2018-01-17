package com.test.service;

import com.test.model.Login;
import com.test.model.User;

public interface UserService {
	public boolean doLogin(Login login);
	public boolean addUser(User user);
	public boolean removeUser(User user);
	public boolean updateUser(User user);
}
