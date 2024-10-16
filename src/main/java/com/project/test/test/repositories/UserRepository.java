package com.project.test.test.repositories;

import com.project.test.test.persistence.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}
