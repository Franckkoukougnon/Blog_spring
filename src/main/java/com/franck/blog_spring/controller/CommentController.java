package com.franck.blog_spring.controller;


import com.franck.blog_spring.entity.Commentaire;
import com.franck.blog_spring.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/all")
    List<Commentaire> getComments() {
        return commentService.getCommentaire();
    }

    @GetMapping("/{id}")
    Commentaire getCommentById(@PathVariable Long id) {
        return commentService.getCommentById(id);
    }

    @PostMapping("/add")
    Commentaire addComment(@RequestBody Commentaire comment) {
        return commentService.addComment(comment);
    }

    @DeleteMapping("/delete/{id}")
    void deleteComment(@PathVariable Long id) {
        commentService.deleteComment(id);
    }

    @PutMapping("/update/{id}")
    Commentaire updateComment(@PathVariable Long id, @RequestBody Commentaire comment) {
       comment.setComment_Id(id);
         return commentService.updateComment(comment);
    }


}
