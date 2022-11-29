package com.example.springblog2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FirstController {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/bubbles")
    @ResponseBody
    public String bubbles() {
        return "bubbles!";
    }

    @GetMapping("/greeting/{name}")
    @ResponseBody
    public String greeting(@PathVariable String name) {
        return "Greeting " + name;
    }
}
