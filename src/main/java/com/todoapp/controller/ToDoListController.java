package com.todoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todoapp.services.ToDoListServices;

@Controller
public class ToDoListController {

	@Autowired
	ToDoListServices services;
	
	@RequestMapping ("/home")
	public String home (Model model) {
		model.addAttribute("greeting", "Welcome to ToDoApp!");
		return "home";
	}
}
