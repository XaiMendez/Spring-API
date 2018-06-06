package com.tminnova.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.tminnova.api.model.User;

@Component
@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {
	
	List<User> findAll();
	
	User findById(int id);
	
}
