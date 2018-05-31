package com.tminnova.api.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tminnova.api.model.User;
import com.tminnova.api.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/")
	@ResponseBody
	public List<User> getAllUsers() {
		//User User = new User(1L, "test", "test");
		System.out.println(userRepository.findAll());
		return userRepository.findAll();
	}

}
