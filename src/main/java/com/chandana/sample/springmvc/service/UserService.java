package com.chandana.sample.springmvc.service;

import java.util.List;

import com.chandana.sample.springmvc.model.User;

public interface UserService {

    User findById(long id);

    User findByName(String name);

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> getAllUsers();

    void deleteAllUsers();

    boolean isUserExist(User user);

}
