package com.davod.amoozeshghah.entity.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class LessonCourseKey implements Serializable {
    @Column(name = "lesson_id",nullable = false)
    private Long lessontId;
    @Column(name = "course_id",nullable = false)
    private Long courseId;
}