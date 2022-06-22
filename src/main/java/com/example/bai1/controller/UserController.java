package com.example.bai1.controller;

import com.example.bai1.model.Permission;
import com.example.bai1.model.User;
import com.example.bai1.service.UserService;
import lombok.Data;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/student")
@Data
public class UserController {
    private final UserService userService;

    @GetMapping("/get")
    public ResponseEntity<List<User>> get(@PathVariable("permissionName") String permissionName,
                                          @RequestHeader Permission permission
                                          ){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/create")
    public ResponseEntity<User> post(@RequestBody User user){
        return ResponseEntity.ok(userService.create(user));
    }
}
