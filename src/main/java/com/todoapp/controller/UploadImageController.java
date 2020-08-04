package com.todoapp.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UploadImageController {

	private String filename = "default.jpg";
	
	@RequestMapping ("/processimage")
	public String processImageUpload (Model model) {
		
		model.addAttribute("todoHeader", "Upload Image");
		model.addAttribute("changeBtn", "Upload");
		model.addAttribute("filename", filename);
		
		return "home";
	}
	
	@RequestMapping (path = "/uploadimage", method = RequestMethod.POST)
	public ModelAndView uploadImage (@RequestParam ("profileImg") CommonsMultipartFile file, HttpSession session) {
		
		ModelAndView mv = new ModelAndView ();
		
		System.out.println("File upload handler.");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		
		byte [] bytes = file.getBytes();
		
		/*we have to save this file to server*/
		String path = session.getServletContext().getRealPath("/") + "resources" + File.separator + "mythem1" + 
			File.separator + "imgs" + File.separator + file.getOriginalFilename();
		System.out.println(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(bytes);
			fos.close();
			System.out.println("Image Uploaded Successfully!");
			
			mv.addObject("msg", "Image Uploaded Sucessfully!");
//			mv.addObject("filename", file.getOriginalFilename());
			filename = file.getOriginalFilename();
			mv.setViewName("redirect:/processimage");
		} catch (IOException ex) {
			ex.printStackTrace();
			mv.addObject("msg", "Image not Uploaded!");
		}
		
		return mv;
	}
}
