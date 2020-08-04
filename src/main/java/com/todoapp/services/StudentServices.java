package com.todoapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todoapp.dao.StudentDao;
import com.todoapp.entities.Student;

@Service
public class StudentServices {

	@Autowired
	StudentDao studentDao;
	
	public int saveStudentRecord (Student student) {
		int id = studentDao.saveStudent(student);
		return id;
	}
}
