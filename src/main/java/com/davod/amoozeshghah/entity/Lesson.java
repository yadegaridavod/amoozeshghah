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

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "lesson_course",
            joinColumns = { @JoinColumn(name = "lesson_id") },
            inverseJoinColumns = { @JoinColumn(name = "course_id") })
    private List<Course>courses;
    @OneToMany(mappedBy = "lesson")
    private List<User>teachers;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "lesson_user",
            joinColumns = { @JoinColumn(name = "lesson_id") },
            inverseJoinColumns = { @JoinColumn(name = "user_id") })
    private List<User>students;

}