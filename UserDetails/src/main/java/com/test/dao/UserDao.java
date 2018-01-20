package com.test.dao;

import com.test.model.Login;

public interface UserDao {
	public boolean validateUser(Login login);
}
