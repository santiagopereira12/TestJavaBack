package com.project.test.test.services;

import com.project.test.test.models.requests.UserRegisterRequestModel;
import com.project.test.test.persistence.entities.UserEntity;
import com.project.test.test.repositories.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity createUser(UserRegisterRequestModel user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        userEntity.setPassword(user.getPassword());
        return this.userRepository.save(userEntity);
    }
}
