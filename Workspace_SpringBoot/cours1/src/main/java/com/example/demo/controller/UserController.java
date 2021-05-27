package com.example.demo.controller;

import java.util.List;

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

	
	@Autowired UserRepository userRepository;  //Injecte la
	
	
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
						//Verifie si ok			si erreur
		if(bindingResult.hasErrors()) {
			return "user/form";
		}
		
		//CRUD --- C
		userRepository.save(user);
		return "home";
	}
	
	@GetMapping("/listUser")
	public String ListUser(Model model) {
		//CRUD --- R
		//List<User> users = userRepository.findAll();
		//model.addAttribute("users",users);
		System.out.println(userRepository.findAll());
		model.addAttribute("users", userRepository.findAll());
		return "user/listUser";
	}

}//Fin HomeController
