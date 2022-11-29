package com.example.springblog2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import repositories.UserRepository;

@Controller
public class AuthController {

    public AuthController(UserRepository userDao) {
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "users/login.html";
    }

}
