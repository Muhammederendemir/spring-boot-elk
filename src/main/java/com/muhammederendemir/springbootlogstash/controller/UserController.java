package com.muhammederendemir.springbootlogstash.controller;

import com.muhammederendemir.springbootlogstash.entity.User;
import com.muhammederendemir.springbootlogstash.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping
    public String healthyCheck() {
        return "test";
    }
}

