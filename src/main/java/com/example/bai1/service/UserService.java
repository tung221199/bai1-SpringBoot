package com.example.bai1.service;

import com.example.bai1.model.Permission;
import com.example.bai1.model.User;
import com.example.bai1.repository.PermissionRepository;
import com.example.bai1.repository.UserRepository;
import lombok.Data;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class UserService {

    private final UserRepository userRepository;
    private final PermissionRepository permissionRepository;

    public List<User> getAllUsers(String permissionName){
        if (permissionName == null){
            return userRepository.findAll();
        }
        else {
            return userRepository.findByUserPermission_Name(permissionName);
        }
    }


    public User create(User user) {
        return userRepository.save(user);
    }
}
