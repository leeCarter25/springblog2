package com.example.springblog2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/testone")
    @ResponseBody
    public String testone() {
        return "This is the landing page!";
    }
}