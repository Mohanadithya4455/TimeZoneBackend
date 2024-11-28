package com.example.TimeZoneProject.controller;


import com.example.TimeZoneProject.model.User;
import com.example.TimeZoneProject.services.UserServiceImpl;
import org.hibernate.internal.util.ZonedDateTimeComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        return  userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public Optional<User> getByid(@PathVariable("id") Long id){
     return  userService.getById(id);
    }
}
