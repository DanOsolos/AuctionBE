package com.sda.auction.services;

import com.sda.auction.entities.User;
import com.sda.auction.exceptions.UserNotFoundException;

import java.util.List;

public interface UserService {

    List<User> findAllUsers();
    void createUser (User user);
    User getUserById (Integer id) throws UserNotFoundException;
    void deleteUserById(Integer id);
    User updateUser (User user);
}
