package com.firstProject.repository.mapper;

import com.firstProject.model.CustomerUser;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<CustomerUser> {
    @Override
    public CustomerUser mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new CustomerUser(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("permissions")
        );
    }
}
