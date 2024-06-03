package com.example.Santander.Devweek.Service;

import com.example.Santander.Devweek.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
