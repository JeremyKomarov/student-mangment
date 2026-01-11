package com.firstProject.model;

public class CustomerUser {
    private Long id;
    private String username;
    private String password;
    private int active;
    private String roles;
    private String permissions;

    public CustomerUser(Long id, String username, String password, String permissions) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.active = 1;
        this.roles = "USER";
        this.permissions = permissions;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getActive() {
        return active;
    }

    public String getRoles() {
        return roles;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }
}
