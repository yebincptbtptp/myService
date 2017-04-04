package com.yeb.www.service.impl;

import org.springframework.stereotype.Service;

import com.yeb.www.po.User;
import com.yeb.www.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	public User findUserByName(String name) {
		User user = new User();
		user.setName(name);
		user.setId(1);
		user.setAge(23);
		return user;
	}

	public User findUserById(int id) {
		User user = new User();
		user.setName("赵东来");
		user.setId(id);
		user.setAge(32);
		return null;
	}

}
