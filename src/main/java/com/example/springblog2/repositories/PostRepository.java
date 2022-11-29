package com.example.springblog2.repositories;

import com.example.springblog2.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
//    List<Post> findAll();
}
