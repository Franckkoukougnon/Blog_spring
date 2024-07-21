package com.franck.blog_spring.service;


import com.franck.blog_spring.entity.Commentaire;
import com.franck.blog_spring.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;

    public List<Commentaire> getCommentaire() {
        return commentRepo.findAll();
    }

    public Commentaire getCommentById(Long id) {
        return commentRepo.findById(id).orElse(null);
    }

    public Commentaire addComment(Commentaire comment) {
        return commentRepo.save(comment);
    }

    public void deleteComment(Long id) {
        commentRepo.deleteById(id);
    }


    public Commentaire updateComment(Commentaire comment) {
        return commentRepo.save(comment);
    }
}
