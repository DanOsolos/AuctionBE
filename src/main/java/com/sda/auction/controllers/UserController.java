package com.sda.auction.controllers;

import com.sda.auction.entities.User;
import com.sda.auction.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<User> findAllUsers(){
        return userService.findAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById (@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public void createUser (@RequestBody User user){
        userService.createUser(user);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUserById (@PathVariable("id") Integer id) {
        userService.deleteUserById(id);
    }

    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User user){
        return userService.updateUser(user, id);
    }

}
