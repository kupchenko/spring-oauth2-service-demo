package me.kupchenko.auth.service.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.kupchenko.auth.service.dao.UserRepository;
import me.kupchenko.auth.service.dto.SecurityUserDetails;
import me.kupchenko.auth.service.dto.UserDto;
import me.kupchenko.auth.service.exception.UserNotFoundException;
import me.kupchenko.auth.service.mapper.UserMapper;
import me.kupchenko.auth.service.model.Role;
import me.kupchenko.auth.service.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) {
        log.info("Loading user for username: {}", username);
        try {
            User user = userRepository.findByName(username)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found"));

            List<GrantedAuthority> grantedAuthorities = user.getRoles()
                    .stream()
                    .map(Role::getName)
                    .map(SimpleGrantedAuthority::new)
                    .collect(Collectors.toList());

            log.info("Got user: {}", user.getName());
            return SecurityUserDetails.builder()
                    .id(user.getId())
                    .username(user.getName())
                    .password(user.getPassword())
                    .authorities(grantedAuthorities)
                    .build();
        } catch (Exception ex) {
            log.warn("Error retrieving user with message: {}", ex.getMessage());
            throw new UsernameNotFoundException(ex.getMessage());
        }
    }

    public UserDto findUserByUsername(String username) {
        return userRepository.findByName(username)
                .map(userMapper::userToUserDto)
                .orElseThrow(() -> new UserNotFoundException(username));
    }

    public UserDto findUserById(Long id) {
        return userRepository.findById(id)
                .map(userMapper::userToUserDto)
                .orElseThrow(() -> new UserNotFoundException(String.valueOf(id)));
    }
}