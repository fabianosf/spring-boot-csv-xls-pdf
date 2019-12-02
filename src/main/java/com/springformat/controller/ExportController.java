/*
 * @author Fabiano Freitas
 */
package com.springformat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springformat.service.UserService;

/**
 * 
 */
@Controller
public class ExportController {

    /**
     * 
     */
    @Autowired
    private UserService userService;

    /**
     * 
     *
     * @param model 
     * @return 
     */
    @GetMapping("/download")
    public String download(Model model) {

        model.addAttribute("users", userService.findAllUsers());
        return "";
    }


}
