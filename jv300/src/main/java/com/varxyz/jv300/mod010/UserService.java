package com.varxyz.jv300.mod010;

import java.util.List;

public class UserService{
	private static UserService service = new UserService();
	public UserDao userDao;
	
	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserService() {
	}

	public void addUser(User user) {
		userDao.plusUser(user);
	}
	
	public void updateUser(User user) {
		userDao.updateUser(user);
	}
	
	public void deleteUserByUserId(User user) {
		userDao.deleteUserByUserId(user);
	}
	
	public List<User> findUser() {
		return userDao.findAllUser();
	}

	public static UserService getInstance() {
		return service;
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public boolean isValidUser(String userId, String passwd) {
		return userDao.isValidUser(userId, passwd);		
	}
	
	
}
