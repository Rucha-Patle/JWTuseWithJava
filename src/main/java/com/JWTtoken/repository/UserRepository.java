package com.JWTtoken.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JWTtoken.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	public Optional<User> findByUsername(String username);

}
