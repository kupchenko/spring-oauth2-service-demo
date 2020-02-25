package me.kupchenko.auth.service.controller;

import lombok.AllArgsConstructor;
import me.kupchenko.auth.service.model.User;
import me.kupchenko.auth.service.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController implements UserController{
    private UserService userService;

    public User findUserByUsername(String username) {
        return userService.findUserByUsername(username);
    }
}