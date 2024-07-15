package com.project.test.test.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer idUser;
    @Column(name = "NAME")
    private String username;
    @Column(name = "EMAIL")
    private String emailUser;
    @Column(name = "ENCRYTED_PASSWORD")
    private String password;
}
