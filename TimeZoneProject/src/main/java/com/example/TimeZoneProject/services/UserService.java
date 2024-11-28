package com.example.TimeZoneProject.services;

import com.example.TimeZoneProject.model.User;

import java.util.Optional;

public interface UserService {
    public User saveUser(User user);
    public Optional<User> getById(Long id);
}
