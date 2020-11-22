package com.todo.services;

import com.todo.entities.User;
import com.todo.infrastructures.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return this.userRepository.save(user);
    }

    public Iterable<User> findAll() {
        return this.userRepository.findAll();
    }
}
