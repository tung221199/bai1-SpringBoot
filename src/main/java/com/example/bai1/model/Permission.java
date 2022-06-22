package com.example.bai1.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "permission")
public class Permission {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "userPermission")
    Set<User> user;
}
