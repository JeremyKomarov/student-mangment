package com.firstProject.repository;

import com.firstProject.model.CustomerUser;
import com.firstProject.model.CustomerUserRequest;

public interface UserRepository {
    void createUser(CustomerUser customerUser);
    CustomerUser findUserByUsername(String username);
}
