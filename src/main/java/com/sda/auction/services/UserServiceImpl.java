package com.sda.auction.services;

import com.sda.auction.entities.User;
import com.sda.auction.exceptions.AuctionNotFoundException;
import com.sda.auction.exceptions.UserNotFoundException;
import com.sda.auction.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__({@Autowired}))
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        user.setCreationDate(Date.from(Instant.now()));
        user.getAddress().setUser(user);
        userRepository.save(user);
    }

    @Override
    public User getUserById(Integer id) throws UserNotFoundException {
        return userRepository.findById(id).orElseThrow(()-> new UserNotFoundException("Could not find user"));
    }

    @Override
    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
