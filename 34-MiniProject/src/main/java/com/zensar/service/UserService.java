package com.zensar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.bean.User;
import com.zensar.db.UserDAO;

@Service
public class UserService {

	@Autowired
	UserDAO dao;

	public User addUser(User user) {
		return this.dao.save(user);

	}

	public User findByUserId(String userId) {

		Optional<User> optional = this.dao.findById(userId);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	public User updateUserById(User user, int id) {
		return this.dao.save(user);
	}

	public User removeUser(User user) {
		this.dao.delete(user);
		return user;
	}

	public List<User> getAllUsers() {
		return this.dao.findAll();
	}

}