package com.example.bai1.service;

import com.example.bai1.model.User;
import com.example.bai1.repository.UserRepository;
import lombok.Data;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class UserService {

    private final UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }


    public User create(User user) {
        return userRepository.save(user);
    }
}
