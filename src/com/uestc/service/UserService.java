package com.uestc.service;

import com.uestc.model.User;

public interface UserService {
	public void saveUser(User user);
	public User findUserByName(String name);
	public void test();
}
