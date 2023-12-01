package com.davod.amoozeshghah.entity;

import com.davod.amoozeshghah.entity.key.LessonCourseKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Entity
@Table(name = "lesson_course")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class LessonCourse {
    @EmbeddedId
    private LessonCourseKey lessonCourseKey;
    @ManyToOne
    @MapsId("lessonId")
    @JoinColumn(name = "lesson_id",nullable = false)
    private Lesson lesson;
    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id",nullable = false)
    private Course course;
}