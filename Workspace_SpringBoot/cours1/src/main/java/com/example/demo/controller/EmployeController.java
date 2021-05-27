package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employe;
import com.example.demo.repository.EmployeRepository;

@Controller
public class EmployeController {

	@Autowired EmployeRepository employeRepository;
	
	@GetMapping("/ajoutEmploye")
	public String ajoutEmploye() {
		return "employe/ajoutEmploye";
	}
	
	@PostMapping("/ajoutEmploye")
	public String ajoutEmploye(@Validated Employe employe, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "employe/ajoutEmploye";
		}
		//  C de CRUD
		employeRepository.save(employe);
		return "home";
	}
	
	@GetMapping("/listeEmploye")
	public String listeEmploye(Model model) {
		//  R de CRUD
		//employeRepository.findAll();
		model.addAttribute("allEmployes", employeRepository.findAll());
		return "employe/listeEmploye";
	}
	/*
	@GetMapping("/showEmploye/{id}") //V1
	public String show(@PathVariable(value= "id") Long employeId, Model model) {
		//CRRUD 
		model.addAttribute("employe", employeRepository.findById(employeId));
		return "employe/showEmploye";
	}
	*/
	@GetMapping("/showEmploye/{id}") //V2
	public String show(@PathVariable(value= "id") Long employeId, Model model) {
		//  R de CRUD 
		Optional<Employe> employe = employeRepository.findById(employeId);
		if(employe.isPresent()) {
			model.addAttribute("detailEmploye", employe.get());
		}
		return "employe/showEmploye";
	}
	
	@PostMapping("/updateEmploye")
	public String updateEmploye(@Validated Employe employe, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "employe/showEmploye";
		}
		//  U de CRUD
		System.out.println(employe.toString());
		
		employeRepository.save(employe);

		return "redirect:/listeEmploye"; 
	} 
	
	@GetMapping("/deleteEmploye/{id}")
	public String deleteEmploye(@PathVariable(value= "id") Long employeId, Model model) {
		//D de CRUD
		employeRepository.deleteById(employeId);
		return "redirect:/listeEmploye"; 
	}

}//Fin Controller
