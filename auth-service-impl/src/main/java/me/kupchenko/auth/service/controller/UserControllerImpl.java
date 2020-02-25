package me.kupchenko.auth.service.controller;

import lombok.AllArgsConstructor;
import me.kupchenko.auth.service.model.User;
import me.kupchenko.auth.service.service.UserService;

@AllArgsConstructor
public class UserControllerImpl implements UserController {
    private UserService userService;

    public User findUserByUsername(String username) {
        return userService.findUserByUsername(username);
    }
}