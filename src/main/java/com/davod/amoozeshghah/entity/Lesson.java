package com.davod.amoozeshghah.entity;

import com.davod.amoozeshghah.entity.enums.LevelType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;
@Entity
@Table(name = "lessons")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Enumerated(EnumType.STRING)
    private LevelType levelType;
    @OneToMany(mappedBy = "lesson")
    private List<User>teachers;


}