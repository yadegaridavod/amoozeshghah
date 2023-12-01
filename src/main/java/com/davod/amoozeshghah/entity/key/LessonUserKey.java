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
public class LessonUserKey implements Serializable {
    private static final long serialVersionUID = 9165055464906531873L;
    @Column(name = "lesson_id",nullable = false)
    private Long lessonId;
    @Column(name = "student_id",nullable = false)
    private Long studentId;
}