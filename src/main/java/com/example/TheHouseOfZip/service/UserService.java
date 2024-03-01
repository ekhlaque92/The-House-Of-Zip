package com.example.TheHouseOfZip.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.TheHouseOfZip.entity.User;
import com.example.TheHouseOfZip.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User saveUser(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}
	
}
