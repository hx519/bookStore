package com.example.demo.dao;
import com.example.demo.entity.User;

import java.util.List;
import java.util.Map;

public interface userDao {
    User checkUser(String username, String password);
    User findUserByUsername(String username);
    void addUser(Map<String, String> input);
    List<User> getAllUsers();
    User findUserByUid(Long uid);
    boolean changeMode(String uid);
}
