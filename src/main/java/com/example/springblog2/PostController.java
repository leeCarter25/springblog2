package com.example.springblog2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String singlePost(@PathVariable long id) {
        return "view individual post " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postsCreate() {
        return "view the form for creating a post";
    }

    @PostMapping( "/posts/create")
    @ResponseBody
    public String submitPost() {
        return "created a new post";
    }


}
