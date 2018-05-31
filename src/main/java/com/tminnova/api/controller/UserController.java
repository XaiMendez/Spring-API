package com.tminnova.api.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tminnova.api.model.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/")
	@ResponseBody
	public User getAllUsers() {
		User User = new User(1L, "test", "test");
		System.out.println(User);
		return User;
	}

}
