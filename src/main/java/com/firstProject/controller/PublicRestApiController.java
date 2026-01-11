package com.firstProject.controller;

import com.firstProject.model.TestResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/public")
public class PublicRestApiController {

    @GetMapping("/test1")
    @CrossOrigin
    public ResponseEntity<?> test1(){
        return ResponseEntity.ok(new TestResponse("API Test 1"));
    }

    @CrossOrigin
    @GetMapping("/test2")
    public ResponseEntity<?> test2(){
        return ResponseEntity.ok(new TestResponse("API Test 2"));
    }

    @CrossOrigin
    @GetMapping("/test3")
    public ResponseEntity<?> test3(){
        return ResponseEntity.ok(new TestResponse("API Test 3"));
    }
}

