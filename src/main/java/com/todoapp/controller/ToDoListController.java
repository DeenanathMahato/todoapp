package com.todoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.todoapp.entities.ToDoList;
import com.todoapp.services.ToDoListServices;

@Controller
public class ToDoListController {

	@Autowired
	ToDoListServices services;
	
	@RequestMapping ("/home")
	public String home (Model model) {
		ToDoList todoList = new ToDoList ();
		model.addAttribute("todoHeader", "Write Todo");
		model.addAttribute("changeBtn", "Save");
		model.addAttribute("todolist", todoList);
		
		return "home";
	}
	
	@RequestMapping (path = "/savetodo", method = RequestMethod.POST)
	public String saveTodo (@ModelAttribute("todolist") ToDoList todoList, Model model) {
		
		System.out.println("savetodo controller fired.");
		
		if (todoList.getTitle().isEmpty() )
		{
			model.addAttribute("msg", "Plese Enter Title&Description");
			
			return "redirect:/home";
		}
		else if (todoList.getDescription().isEmpty()) {
			
			model.addAttribute("msg", "Plese Enter Title&Description");
			
			return "redirect:/home";
		}
		
		int status = this.services.saveToDo(todoList);
		if (status > 0)
			model.addAttribute("msg", status + " Todo Inserted Successfully!");
	
		return "redirect:/home";
	}
	
	@RequestMapping ("/updatetodo")
	public String update (Model model) {
		
		ToDoList todoList = new ToDoList ();
		todoList.setTitle("Testing");
		todoList.setDescription("Yes This is getting...");
		
		model.addAttribute("todoHeader", "Update Todo");
		model.addAttribute("changeBtn", "Update");
		model.addAttribute("todolist", todoList);

		return "home";
	}
}
