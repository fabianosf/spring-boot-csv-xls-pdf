package com.springformat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springformat.entity.User;

/**
 * 
 */
public interface UserRepository extends JpaRepository<User, Integer>{

}
