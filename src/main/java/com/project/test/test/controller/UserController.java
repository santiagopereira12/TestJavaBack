package com.project.test.test.controller;

import com.project.test.test.models.requests.UserRegisterRequestModel;
import com.project.test.test.persistence.entities.UserEntity;
import com.project.test.test.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    public UserEntity createUser(@RequestBody @Valid UserRegisterRequestModel userModel) {
        UserEntity user = userService.createUser(userModel);
        return user;
    }
}
