package com.tminnova.api.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tminnova.api.model.User;
import com.tminnova.api.repository.UserRepository;
import com.tminnova.api.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	 @Autowired
	 private UserService userService;
	
	@GetMapping("/")
	public List getAllUsers() {
		return userService.findAll();
	}
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) {	
		return userService.create(user);
	}
	
	@PutMapping("/")
    public User update(@RequestBody User user){
        return userService.update(user);
    }
	
	@GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") int id){
        return userService.findById(id);
    }
	
	@DeleteMapping(path ={"/{id}"})
	public User deleteUser(@PathVariable("id") int id) {	
		return userService.delete(id);
	}

}
