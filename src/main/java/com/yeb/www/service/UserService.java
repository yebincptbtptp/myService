package com.yeb.www.service;

import com.yeb.www.po.User;

public interface UserService {

	public User findUserByName(String name);
	
	public User findUserById(int id);
}
