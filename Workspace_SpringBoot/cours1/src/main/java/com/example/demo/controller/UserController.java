package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
 
@Controller
public class UserController {

	
	@Autowired UserRepository userRepository;
	
	
	@GetMapping("/ajout")
	public String Ajout() {
		return "user/form";
	} 
	
	/*
	@RequestMapping(value="/ajout", method = RequestMethod.GET)
	public String Ajout(Model model) {
		model.addAttribute("user", new User());
		return "user/form";
	}*/
	
	@PostMapping("/ajout") 
	public String Ajout(@Validated User user, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return "user/form";
		}
		
		//CRUD --- C
		userRepository.save(user);
		return "home";
	}

}//Fin HomeController
