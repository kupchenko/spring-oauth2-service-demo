package me.kupchenko.auth.service.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.kupchenko.auth.service.dto.UserDto;
import me.kupchenko.auth.service.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@AllArgsConstructor
public class UserControllerImpl implements UserController {
    private UserService userService;

    @Override
    public UserDto findUserByUsername(String username) {
        log.info("Searching user by username [{}]", username);
        return userService.findUserByUsername(username);
    }

    @Override
    public UserDto findUserById(Long id) {
        log.info("Searching user by id [{}]", id);
        return userService.findUserById(id);
    }
}