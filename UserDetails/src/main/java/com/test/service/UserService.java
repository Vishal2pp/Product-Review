package com.test.service;

import com.test.model.Login;

public interface UserService {
	public boolean validateUser(Login login);
	public boolean validateUserName(Login login);
	public boolean validatepassword(Login login);
	
}
