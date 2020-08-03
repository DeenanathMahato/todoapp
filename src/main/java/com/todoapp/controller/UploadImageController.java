package com.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UploadImageController {

	@RequestMapping ("/processimage")
	public String uploadImage (Model model) {
		
		model.addAttribute("todoHeader", "Upload Image");
		model.addAttribute("changeBtn", "Upload");
		
		return "home";
	}
	
	@RequestMapping ("/uploadimage")
	public String processImageUpload () {
		
		return "redirect:/processImagaeUpload";
	}
}
