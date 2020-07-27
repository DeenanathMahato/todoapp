package com.todoapp.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.todoapp.entities.ToDoList;

@Component
public interface ToDoListDao {
	
	public int saveToDo (ToDoList toDoList);
	public void updateToDo (ToDoList toDoList);
	public List<ToDoList> getAllTodoList ();
}
