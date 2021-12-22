package com.example.demo;

public interface UserDao {
    public String retrievePassword(String username);
    public boolean createUser(String username, String password);
}