package com.example.springblog2.repositories;

import com.example.springblog2.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Long> {
    Ad findByTitle(String title);
}
