package com.example.signuppage.service;

import com.example.signuppage.entity.User;

public interface UserService {
    User saveUser(User user);
    Iterable<User> getAllUsers();
}