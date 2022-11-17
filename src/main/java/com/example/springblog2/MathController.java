package com.example.springblog2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(method = RequestMethod.GET, path = "/add/3/and/4")
    @ResponseBody
    public int arithmetic() {
        return 7;
    }

}
