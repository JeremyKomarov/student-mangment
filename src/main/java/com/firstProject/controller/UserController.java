package com.firstProject.controller;

import com.firstProject.model.CustomerUserRequest;
import com.firstProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/create")
    @CrossOrigin
    public ResponseEntity<?> createUser(@RequestBody CustomerUserRequest customerUserRequest) {
        try {
            userService.createUser(customerUserRequest);
            return null;
        } catch (Exception exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
        }
    }
}
