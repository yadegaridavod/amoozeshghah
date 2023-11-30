package com.davod.amoozeshghah.mapper;

import com.davod.amoozeshghah.dto.UserDto;
import com.davod.amoozeshghah.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {AccountMapper.class,LessonMapper.class,RoleMapper.class})
public interface UserMapper {
    UserDto toUserDto(User user);
    User toUser(UserDto userDto);
}