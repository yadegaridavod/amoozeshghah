package com.davod.amoozeshghah.dto;

import com.davod.amoozeshghah.entity.enums.LevelType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class LessonDto {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    private LevelType levelType;
}