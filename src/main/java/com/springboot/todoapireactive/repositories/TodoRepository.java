package com.springboot.todoapireactive.repositories;

import com.springboot.todoapireactive.model.Todo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    
}
