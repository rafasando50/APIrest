package proyecto.apirest.service;

import jakarta.validation.ConstraintViolationException;
import proyecto.apirest.model.TodoDTO;
import proyecto.exception.TodoCollectionException;

public interface TodoService { 
    public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException;
}
