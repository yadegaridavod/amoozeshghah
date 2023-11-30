package com.davod.amoozeshghah.entity;

import com.davod.amoozeshghah.entity.enums.Result;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Table(name = "questions")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "azemoon_id")
    private Azemoon azemoon;
    @Column(nullable = false,unique = true)
    private String question;
    @Column(nullable = false)
    private String answer1;
    @Column(nullable = false)
    private String answer2;
    @Column(nullable = false)
    private String answer3;
    @Column(nullable = false)
    private String answer4;
    @Enumerated(EnumType.STRING)
    private Result result;
}