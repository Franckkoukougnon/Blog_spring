package com.franck.blog_spring.repository;

import com.franck.blog_spring.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepo extends JpaRepository<Post, Long> {
}
