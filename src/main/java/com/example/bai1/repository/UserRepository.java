package com.example.bai1.repository;

import com.example.bai1.model.Permission;
import com.example.bai1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUserPermission_Name(String permissionName);
}
