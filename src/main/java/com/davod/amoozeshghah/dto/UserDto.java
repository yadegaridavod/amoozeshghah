package com.davod.amoozeshghah.dto;

import com.davod.amoozeshghah.entity.Account;
import com.davod.amoozeshghah.entity.Lesson;
import com.davod.amoozeshghah.entity.Role;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

public class UserDto {
    private Role role;
    @NotNull
    private AccountDto account;
    private Lesson lesson;
}