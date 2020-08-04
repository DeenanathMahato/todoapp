package com.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todoapp.entities.Student;

@Controller
public class RegisterController {

	@RequestMapping ("/register")
	public String registerForm () {
		
		return "registerform";
	}
	
	@RequestMapping ("/formsubmited")
	public String submitForm (@ModelAttribute Student student) {
		System.out.println(student);
		return "formsuccess";
	}
}
