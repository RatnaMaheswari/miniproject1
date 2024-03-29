package com.customer.model.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customer.model.persistance.User;
import com.customer.model.persistance.UserDao;


@Service
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User findUser(String email, String password) {
		return userDao.findUser(email, password);
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return userDao.getAllUser();
	}

}
