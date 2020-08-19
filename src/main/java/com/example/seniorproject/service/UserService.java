package com.example.seniorproject.service;

import com.example.seniorproject.service.model.ResponseEntity;
import com.example.seniorproject.service.model.UserEntity;

public interface UserService {

    ResponseEntity addUser(UserEntity userEntity, String greenHouseId);

    UserEntity getUserByUserName(String userName);
}
