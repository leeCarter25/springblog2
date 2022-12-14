package com.example.springblog2.controllers;

import com.example.springblog2.models.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.springblog2.repositories.UserRepository;

@Controller
public class UserController {

    private UserRepository userDao;

    private PasswordEncoder passwordEncoder;

    public UserController(UserRepository userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/sign-up")
    public String showSignUpForm(Model model) {
        model.addAttribute("newUser", new User());
        return "users/signup";
    }

    @PostMapping("/sign-up")
    public String saveUser(@ModelAttribute User user) {
        // Hash the password using the encode method.
        String hash = passwordEncoder.encode(user.getPassword());
        // Set the password to the hashed version.
        user.setPassword(hash);
        // Save the user to the DB.
        userDao.save(user);
        return "redirect:/login";
    }
}