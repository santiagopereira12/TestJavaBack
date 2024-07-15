package com.project.test.test.models.requests;

import lombok.Data;

@Data
public class UserRegisterRequestModel {
    private String name;
    private String email;
    private String password;
}
