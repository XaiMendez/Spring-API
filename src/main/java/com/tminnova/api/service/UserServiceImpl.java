package com.tminnova.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tminnova.api.model.User;
import com.tminnova.api.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository repository;

    public User create(User user) {
        return repository.save(user);
    }

    public User delete(int id) {
        User user = findById(id);
        if(user != null){
            repository.delete(user);
        }
        return user;
    }

    public List findAll() {
        return repository.findAll();
    }

    public User findById(int id) {
        return repository.findById(id);
    }

    public User update(User user) {
        return repository.save(user);
    }

}
