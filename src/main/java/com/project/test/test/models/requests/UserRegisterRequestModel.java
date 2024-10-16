package com.project.test.test.models.requests;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class UserRegisterRequestModel {
    @NotEmpty
    private String username;
    @NotEmpty
    @Email
    private String emailUser;
    @NotEmpty
    @Size(min = 8, max = 50)
    private String password;
}
