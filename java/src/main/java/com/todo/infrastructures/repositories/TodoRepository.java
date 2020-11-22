package com.todo.infrastructures.repositories;

import com.todo.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Integer> {
}
