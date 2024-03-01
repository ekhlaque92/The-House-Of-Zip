package com.example.TheHouseOfZip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.TheHouseOfZip.entity.User;
import com.example.TheHouseOfZip.service.UserService;

@RestController
public class HomeController{
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
		User user1 = userService.saveUser(user);
		return user1;
		
	}
	
}