package com.example.TimeZoneProject.services;

import com.example.TimeZoneProject.model.User;
import com.example.TimeZoneProject.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo userRepo;
    @Override
    public User saveUser(User user) {
       return userRepo.save(user);
    }
     //This is to get user by id  service method
    //This is the changes made in branch2 base branch is master
    @Override
    public Optional<User> getById(Long id) {
        Optional<User> user= userRepo.findById(id);
        ZonedDateTime date = user.get().getCreatedAt();
         String time_zone="Asia/Singapore";
        ZonedDateTime istDateTime = date.withZoneSameInstant(ZoneId.of(time_zone));
        user.get().setCreatedAt(istDateTime);
        return Optional.of(user.get());
    }
}
