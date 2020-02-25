package me.kupchenko.auth.service.api.controller;

import lombok.AllArgsConstructor;
import me.kupchenko.auth.service.api.model.User;
import me.kupchenko.auth.service.api.service.UserService;

@AllArgsConstructor
public class UserControllerImpl implements UserController {
    private UserService userService;

    public User findUserByUsername(String username) {
        return userService.findUserByUsername(username);
    }
}