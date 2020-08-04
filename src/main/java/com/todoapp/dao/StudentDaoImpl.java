package com.todoapp.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.todoapp.entities.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	HibernateTemplate hTemplate;
	
	@Transactional
	public int saveStudent(Student student) {
		// saving the data of student
		int id = (Integer) hTemplate.save(student);
		return id;
	}

	public HibernateTemplate getTemplate() {
		return hTemplate;
	}

	public void setTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}
}
