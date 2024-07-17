package com.project.test.test.controller;

import com.project.test.test.models.requests.UserRegisterRequestModel;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/usuarios")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody @Valid UserRegisterRequestModel userRegisterRequestModel) {
        return "Usuario creado";
    }
}
