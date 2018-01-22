package com.product.dao;

import com.product.model.User;

public interface LoginDao {
	public boolean validateUser(String uName, String uPass);
	public boolean addUser(User u);
}
