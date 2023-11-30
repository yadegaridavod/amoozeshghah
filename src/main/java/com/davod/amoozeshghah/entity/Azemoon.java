package com.davod.amoozeshghah.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
@Entity
@Table(name = "azemoons")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Azemoon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;
}