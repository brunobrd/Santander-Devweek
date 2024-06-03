package com.example.Santander.Devweek.Service.impl;

import UserRepository.UserRepository;
import com.example.Santander.Devweek.Service.UserService;
import com.example.Santander.Devweek.User;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("Este numero de conta ja existe");
        }
        return userRepository.save(userToCreate);
    }
}
