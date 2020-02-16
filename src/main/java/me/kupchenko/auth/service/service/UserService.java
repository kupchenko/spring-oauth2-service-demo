package me.kupchenko.auth.service.service;

import lombok.AllArgsConstructor;
import me.kupchenko.auth.service.dao.UserRepository;
import me.kupchenko.auth.service.model.Role;
import me.kupchenko.auth.service.model.User;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            User user = userRepository.findByName(username)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found"));
            List<GrantedAuthority> grantedAuthorities = new LinkedList<>();
            for (Role role : user.getRoles()) {
                grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
            }
            return new org.springframework.security.core.userdetails.User(username,
                    user.getPassword(),
                    grantedAuthorities);
        } catch (DataAccessException ex) {
            throw new UsernameNotFoundException(ex.getMessage());
        }
    }
}
