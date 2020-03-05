package me.kupchenko.auth.service.controller;

import lombok.AllArgsConstructor;
import me.kupchenko.auth.service.dto.UserDto;
import me.kupchenko.auth.service.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;

@AllArgsConstructor
public class UserControllerImpl implements UserController {
    private UserService userService;

    public UserDto findUserByUsername(@PathVariable String username) {
        return userService.findUserByUsername(username);
    }
}