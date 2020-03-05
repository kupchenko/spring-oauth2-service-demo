package me.kupchenko.auth.service.controller;

import me.kupchenko.auth.service.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
public interface UserController {
    @GetMapping("/{username}")
    UserDto findUserByUsername(@PathVariable String username);
}