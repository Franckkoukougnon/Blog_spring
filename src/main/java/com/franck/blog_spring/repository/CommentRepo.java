package com.franck.blog_spring.repository;

import com.franck.blog_spring.entity.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CommentRepo extends JpaRepository<Commentaire, Long> {
}
