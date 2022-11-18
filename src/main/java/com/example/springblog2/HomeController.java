package com.example.springblog2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String landing() {
        return "This is the landing page!";
    }

        // To show anchor tag options page
        @GetMapping("/roll-dice")
        public String showChoices() {
            return "roll-dice";
        }

        // To show results of guess
        @GetMapping("/roll-dice/{n}")
        public String showResults(@PathVariable int n, Model model) {
            // Establish the random number variable
            int randomNum = (int) Math.floor(Math.random() * ((7 - 1) + 1));

            // check if the path variable is equal to the random number

            boolean result = n == randomNum;

            model.addAttribute("result", result);
            model.addAttribute("randomNum", randomNum);

            return "roll-dice";
        }


    }
