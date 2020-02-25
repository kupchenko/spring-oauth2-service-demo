package me.kupchenko.auth.service.api.dao;

import me.kupchenko.auth.service.api.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Override
    List<User> findAll();

    Optional<User> findByName(String username);
}
