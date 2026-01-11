package com.firstProject.security;

import com.firstProject.model.CustomerUser;
import com.firstProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        CustomerUser customerUser = userService.findUserByUsername(username);
        if(customerUser == null) {
            throw new UsernameNotFoundException("The provided username cant be found");
        }

        return User.builder()
                .username(customerUser.getUsername())
                .password(customerUser.getPassword())
                .roles(customerUser.getRoles())
                .build();
    }
}
