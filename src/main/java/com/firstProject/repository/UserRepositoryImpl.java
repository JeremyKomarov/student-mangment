package com.firstProject.repository;

import com.firstProject.model.CustomerUser;
import com.firstProject.repository.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static final String USERS_TABLE_NAME = "users";

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void createUser(CustomerUser customerUser) {
        String sql = "INSERT INTO " + USERS_TABLE_NAME + " (username, password, roles, permissions) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, customerUser.getUsername(), customerUser.getPassword(), customerUser.getRoles(), customerUser.getPermissions());
    }

    @Override
    public CustomerUser findUserByUsername(String username) {
        String sql = "SELECT * FROM " + USERS_TABLE_NAME + " WHERE username=?";
        try {
            return jdbcTemplate.queryForObject(sql, new UserMapper(), username);
        } catch (EmptyResultDataAccessException error) {
            return null;
        }
    }
}
