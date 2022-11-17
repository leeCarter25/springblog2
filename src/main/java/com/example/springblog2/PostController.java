package com.example.springblog2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postsId() {
        return "view individual post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsCreate() {
        return "view the form for creating a post";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/posts/create")
    @ResponseBody
    public String postCreate() {
        return "create a new post";
    }


}
