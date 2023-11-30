package com.davod.amoozeshghah.mapper;

import com.davod.amoozeshghah.dto.LessonDto;
import com.davod.amoozeshghah.entity.Lesson;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LessonMapper {
    LessonDto toLessonDto(Lesson lesson);
    Lesson toLesson(LessonDto lessonDto);
}