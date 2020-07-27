package com.todoapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.todoapp.entities.ToDoList;

@Repository
public class ToDoListDaoImpl implements ToDoListDao {

	@Autowired
	HibernateTemplate template;

	@Transactional
	public int saveToDo(ToDoList toDoList) {
		// storing to do list object
		int id = (Integer) this.template.save(toDoList);
		return id;
	}
	
	@Transactional
	public void updateToDo(ToDoList toDoList) {
		// updating todo list
		this.template.update(toDoList);
	}
	
	public List<ToDoList> getAllTodoList() {
		// retrieving all records
		List<ToDoList> todoList = this.template.loadAll(ToDoList.class);
		return todoList;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
}
