package com.franck.blog_spring.repository;

import com.franck.blog_spring.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<Image, Long> {
}
