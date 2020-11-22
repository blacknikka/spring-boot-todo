package com.todo.services;

import com.todo.entities.Todo;
import com.todo.infrastructures.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public Todo save(Todo todo) {
        return this.todoRepository.save(todo);
    }

    public Iterable<Todo> findAll() {
        return this.todoRepository.findAll();
    }
}
