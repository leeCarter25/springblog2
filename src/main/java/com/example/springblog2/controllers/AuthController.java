package com.example.springblog2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.springblog2.repositories.UserRepository;

@Controller
public class AuthController {
    private UserRepository userDao;


    public AuthController(UserRepository userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "users/login";
    }

}
