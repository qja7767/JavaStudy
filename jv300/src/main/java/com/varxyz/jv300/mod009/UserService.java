package com.varxyz.jv300.mod009;


public class UserService{
	public UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser(User user) {
		userDao.plusUser(user);
	}

}