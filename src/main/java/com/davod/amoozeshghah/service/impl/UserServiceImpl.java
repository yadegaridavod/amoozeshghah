package com.davod.amoozeshghah.service.impl;

import com.davod.amoozeshghah.entity.User;
import com.davod.amoozeshghah.repository.UserRepository;
import com.davod.amoozeshghah.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User save(User user){
       return userRepository.save(user);
    }
}