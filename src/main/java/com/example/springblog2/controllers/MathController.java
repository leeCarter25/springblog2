package com.example.springblog2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int arithmetic(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public int subtract(@PathVariable int num1, @PathVariable int num2) {
        return num1 - num2;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int multiply(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public int quotient(@PathVariable int num1, @PathVariable int num2) {
        return num1 / num2;
    }



}
