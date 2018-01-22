package com.product.service;

import com.product.model.User;

public interface UserService {
	public boolean validateUser(String uName, String uPass);
	public boolean addUser(User u);
}
