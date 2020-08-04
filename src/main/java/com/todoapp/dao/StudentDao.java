package com.todoapp.dao;

import org.springframework.stereotype.Component;

import com.todoapp.entities.Student;

@Component
public interface StudentDao {

	public int saveStudent (Student student);
}
