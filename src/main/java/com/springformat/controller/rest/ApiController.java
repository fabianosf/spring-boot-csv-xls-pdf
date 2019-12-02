/*
 * @author Fabiano Freitas
 */
package com.springformat.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springformat.entity.User;
import com.springformat.service.UserService;

import java.util.List;

/**
 * 
 */
@RestController
public class ApiController {

    /**
     * 
     */
    @Autowired
    private UserService userService;

    /**
     * 
     *
     * @return 
     */
    @GetMapping("/")
    public List<User> viewHome() {

        return userService.findAllUsers();
    }


}
