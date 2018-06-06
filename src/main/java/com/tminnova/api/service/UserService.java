package com.tminnova.api.service;

import java.util.List;

import com.tminnova.api.model.User;

public interface UserService {

	User create(User user);

	User delete(int id);

	User findById(int id);

	List findAll();

	User update(User user);

}
