package com.todoapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.todoapp.entities.ToDoList;

public class ToDoListDaoImpl implements ToDoListDao {

	@Autowired
	HibernateTemplate template;

	public int saveToDo(ToDoList toDoList) {
		// storing to do list object
		int recorded = (Integer) this.template.save(toDoList);
		return recorded;
	}

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

}
