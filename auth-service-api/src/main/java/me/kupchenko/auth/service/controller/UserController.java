package me.kupchenko.auth.service.controller;

import me.kupchenko.auth.service.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/users")
public interface UserController {
    @GetMapping
    UserDto findUserByUsername(@RequestParam("username") String username);

    @GetMapping("/{id}")
    UserDto findUserById(@PathVariable("id") Long id);
}