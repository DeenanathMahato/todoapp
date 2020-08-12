package com.todoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todoapp.entities.Student;
import com.todoapp.services.StudentServices;

@Controller
public class RegisterController {

	@Autowired
	StudentServices studentServices;
	
	@RequestMapping ("/register")
	public String showForm () {
		
		return "registerform";
	}
	
	@RequestMapping (path = "/formsubmited", method = RequestMethod.POST)
	public String submitForm (@ModelAttribute("student") Student student, BindingResult br) {
		
		if (br.hasErrors())
			return "registerform";
		
		System.out.println(student);
		int id = studentServices.saveStudentRecord(student);
		System.out.println("Number of Row affected: " + id);
		return "formsuccess";
	}
}
