package com.davod.amoozeshghah.entity;

import com.davod.amoozeshghah.entity.key.LessonUserKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Table(name = "lesson_user")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class LessonUser {
    @EmbeddedId
    private LessonUserKey lessonUserKey;
    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    private User student;
    @ManyToOne
    @MapsId("lessonId")
    @JoinColumn(name = "lesson",nullable = false)
    private Lesson lesson;
}