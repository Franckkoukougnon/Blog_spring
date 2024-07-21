package com.franck.blog_spring.repository;

import com.franck.blog_spring.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
