package com.firstProject.service;

import com.firstProject.security.CustomerUserDetailsService;
import com.firstProject.security.model.AuthenticationRequest;
import com.firstProject.security.model.AuthenticationResponse;
import com.firstProject.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{

    @Autowired
    private CustomerUserDetailsService customerUserDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;


    @Override
    public AuthenticationResponse createAuthenticationToken(AuthenticationRequest authenticationRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        } catch (Exception exception) {
            throw new Exception("Incorrect Username or Password");
        }

        UserDetails userDetails = customerUserDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        return new AuthenticationResponse(jwtUtil.generateToken(userDetails));
    }
}
