package com.todo.services;

import com.todo.entities.User;
import com.todo.infrastructures.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User save(User user);
    public Iterable<User> findAll();
}
