/*
 * @author Fabiano Freitas
 */
package com.springformat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springformat.entity.User;
import com.springformat.repository.UserRepository;

/**
 * 
 */
@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	
	public List<User> findAllUsers() {
		return repository.findAll();

	}

}
