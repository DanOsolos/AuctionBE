package com.sda.auction.controllers;

import com.sda.auction.entities.User;
import com.sda.auction.exceptions.UserNotFoundException;
import com.sda.auction.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class UserController {

    private final UserService userService;
    private static final String PATH = "/user";

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping(PATH + "/{id}")
    public User getUserById (@PathVariable("id") Integer id) throws UserNotFoundException {
        return userService.getUserById(id);
    }

    @PostMapping(PATH)
    public void createUser (@RequestBody User user){
        userService.createUser(user);
    }

    @DeleteMapping(PATH + "/{id}")
    public void deleteUserById (@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
    }

    @PutMapping(PATH)
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

}
