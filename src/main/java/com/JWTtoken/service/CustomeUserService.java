package com.JWTtoken.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.JWTtoken.entity.User;
import com.JWTtoken.repository.UserRepository;

@Service
public class CustomeUserService implements UserDetailsService{

	@Autowired
	private UserRepository ur;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//load user from database
		User user=ur.findByUsername(username).orElseThrow(()-> new UsernameNotFoundException("User not found with username: " + username));
		return user;
	}

}
