package models;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping("/posts")
    public String postsIndex(Model model) {
        // Instantiate the list to hold all the Post objects
        List<Post> allPosts = new ArrayList<>();
        // Instantiate new Post objects
        Post p1 = new Post(1, "Test Title", "test body");
        Post p2 = new Post(2, "Exam Title", "exam body");
        Post p3 = new Post(3, "Assessment Title", "assessment body");
        Post p4 = new Post(4, "Final Title", "final body");
        // Add newly instantiated Posts to the list
        allPosts.add(p1);
        allPosts.add(p2);
        allPosts.add(p3);
        allPosts.add(p4);
        // Add the list of Posts as a model attribute to send to the template for rendering.
        model.addAttribute("allPosts", allPosts);
        // return the template
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String singlePost(@PathVariable long id, Model model) {
        Post singlePost = new Post(id, "First Post!", "This is the first time I've ever used Spring!");
        model.addAttribute("post", singlePost);
        return "posts/show";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String showCreateForm() {
        return "Viewing the form to create a post.";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String submitPost() {
        return "New Post created!";
    }

}
