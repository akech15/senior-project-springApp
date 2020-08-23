package com.example.seniorproject.service.repository;

import com.example.seniorproject.service.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByUserNameAndPassword(String userName, String password);

	UserEntity findByUserName(String userName);

	UserEntity findByGreenHouseId(String greenHouseId);

}
