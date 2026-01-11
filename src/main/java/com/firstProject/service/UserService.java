package com.firstProject.service;

import com.firstProject.model.CustomerUser;
import com.firstProject.model.CustomerUserRequest;

public interface UserService {
    void createUser(CustomerUserRequest customerUserRequest) throws Exception;
    CustomerUser findUserByUsername(String username);
}
