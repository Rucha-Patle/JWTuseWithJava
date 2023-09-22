package com.JWTtoken.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JWTtoken.entity.User;
import com.JWTtoken.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService as;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@PostMapping("/admin/add")
	public String addUser(@RequestBody User user) {
		as.addUser(user);
		return "user add successfully";
	}
	
	@GetMapping("/user/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable int id) {
		Optional<User> user =as.getUserById(id);
		if(user==null) {
			return ResponseEntity.notFound().build();
				}
			else {
				return ResponseEntity.ok(user);
			}
		}
	
	@GetMapping("/allUsers")
	public Object getAllUsers() {
		return as.getAllUsers();
	}
	}

