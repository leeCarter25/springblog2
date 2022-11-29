package com.example.springblog2.repositories;

import com.example.springblog2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
//    List<User> findAll();
}
