package com.todoapp.dao;

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
