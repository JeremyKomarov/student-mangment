package com.firstProject.service;

import com.firstProject.model.CustomerUser;
import com.firstProject.model.CustomerUserRequest;
import com.firstProject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(CustomerUserRequest customerUserRequest) throws Exception {
        CustomerUser existingUser = userRepository.findUserByUsername(customerUserRequest.getUsername());
        if(existingUser != null) {
            throw new Exception("Username " + customerUserRequest.getUsername() + " is already taken");
        }
        userRepository.createUser(customerUserRequest.toCustomerUser());
    }

    @Override
    public CustomerUser findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}
