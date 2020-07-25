package com.todoapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapp.dao.ToDoListDao;
import com.todoapp.entities.ToDoList;

@Service
public class ToDoListServices {
	
	@Autowired
	ToDoListDao dao;
	
	public int saveToDo (ToDoList toDoList) {
		
		return dao.saveToDo(toDoList);
	}
}
