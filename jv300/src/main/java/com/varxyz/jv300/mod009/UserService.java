package com.varxyz.jv300.mod009;

import java.util.List;

public class UserService{
	public UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser(User user) {
		userDao.plusUser(user);
	}
	
	public List<User> findUser(User user) {
		return userDao.findAllUser();
	}
}
