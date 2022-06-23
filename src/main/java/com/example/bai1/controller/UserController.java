package com.example.bai1.controller;

import com.example.bai1.model.Permission;
import com.example.bai1.model.User;
import com.example.bai1.service.UserService;
import lombok.Data;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/get")
    public ResponseEntity<List<User>> get(@RequestHeader(name = "permissionName", required = false) String permissionName ){
        return ResponseEntity.ok(userService.getAllUsers(permissionName));
    }

    @PostMapping("/create")
    public ResponseEntity<User> post(@RequestBody User user){
        return ResponseEntity.ok(userService.create(user));
    }
}
