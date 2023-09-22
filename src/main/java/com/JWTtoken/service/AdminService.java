package com.JWTtoken.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.JWTtoken.entity.User;
import com.JWTtoken.repository.UserRepository;

@Service
public class AdminService {

	@Autowired
	private UserRepository ur;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User addUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getpassword()));
		return ur.save(user);
	}

	public Optional<User> getUserById(int id) {
		return ur.findById(id);
	}

	public Object getAllUsers() {
		return ur.findAll();
	}
}
