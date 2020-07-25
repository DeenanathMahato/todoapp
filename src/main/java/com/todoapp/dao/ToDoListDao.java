package com.todoapp.dao;

import org.springframework.stereotype.Component;

import com.todoapp.entities.ToDoList;

@Component
public interface ToDoListDao {
	
	public int saveToDo (ToDoList toDoList);
}
