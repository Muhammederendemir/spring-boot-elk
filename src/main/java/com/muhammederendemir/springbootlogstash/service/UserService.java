package com.muhammederendemir.springbootlogstash.service;

import com.muhammederendemir.springbootlogstash.entity.User;
import com.muhammederendemir.springbootlogstash.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }
}
