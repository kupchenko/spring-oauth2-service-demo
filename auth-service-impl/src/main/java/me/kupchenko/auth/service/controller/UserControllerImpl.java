package me.kupchenko.auth.service.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.kupchenko.auth.service.dto.UserDto;
import me.kupchenko.auth.service.service.UserService;

@Slf4j
@AllArgsConstructor
public class UserControllerImpl implements UserController {
    private UserService userService;

    public UserDto findUserByUsername(String username) {
        log.info("Searching user by username [{}]", username);
        return userService.findUserByUsername(username);
    }
}