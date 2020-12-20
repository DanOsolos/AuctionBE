package com.sda.auction.services;

import com.sda.auction.entities.User;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    void createUser (User user);
    User getUserById (Integer id);
    void deleteUserById(Integer id);
    User updateUser (User user, Integer id);
}
