package com.project.test.test.services;

import com.project.test.test.models.requests.UserRegisterRequestModel;
import com.project.test.test.persistence.entities.UserEntity;

public interface UserService {

    public UserEntity createUser(UserRegisterRequestModel user);
}
