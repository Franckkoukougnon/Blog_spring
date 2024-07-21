package com.franck.blog_spring.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Setter
public class Commentaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id", nullable = false)
    private Long comment_Id;

    @Column(columnDefinition = "TEXT")
    private String commentaire;


    private LocalDate dateCommentaire;

}
