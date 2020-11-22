package com.todo.services;

import com.todo.entities.Todo;
import com.todo.infrastructures.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface TodoService {

    public Todo save(Todo todo);
    public Iterable<Todo> findAll();
}
