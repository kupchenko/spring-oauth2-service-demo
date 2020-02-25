package me.kupchenko.auth.service.controller;

import me.kupchenko.auth.service.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public interface UserController {
    @GetMapping("/{username}")
    User findUserByUsername(@PathVariable String username);
}