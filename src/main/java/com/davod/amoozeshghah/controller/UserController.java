package com.davod.amoozeshghah.controller;

import com.davod.amoozeshghah.dto.UserDto;
import com.davod.amoozeshghah.entity.User;
import com.davod.amoozeshghah.mapper.UserMapper;
import com.davod.amoozeshghah.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping
    public ResponseEntity<UserDto> save(UserDto userDto){
        User user = userService.save(userMapper.toUser(userDto));
        return new ResponseEntity<>(userDto, HttpStatus.OK);
    }
}