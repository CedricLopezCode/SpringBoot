package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Conducteur;
import com.example.demo.repository.ConducteurRepository;


@Controller
public class ConducteurController {

	@Autowired ConducteurRepository conducteurRepository;
	
	//CCCCCCCCCCCCCCCCCCCCCCCCCCCC
	@PostMapping("/ajoutConducteur")  //  CCC
	public String ajoutConducteur(@Validated Conducteur conducteur, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "home";
		}
		conducteurRepository.save(conducteur);
		return "redirect:/pageConducteur";
	}
	
	//RRRRRRRRRRRRRRRRRRRRRRRR
	@GetMapping("/pageconducteur")	// RRR
	public String readAllconducteurs(Model model) {
		model.addAttribute("allConducteurs", conducteurRepository.findAll());
		return "conducteur/conducteur";
	}
	
	//	UUUUUUUUUUUUUUUU
	@GetMapping("/updateConducteur/{id_conducteur}")	// Partie RRR 
	public String recupConducteur(@PathVariable(value= "id_conducteur") Long id_conducteur, Model model, BindingResult bindingResult) {
		model.addAttribute("unConducteur", conducteurRepository.findById(id_conducteur).get());
		return "/pageConducteur";
	}
	@PostMapping("/updateConducteur/{id_conducteur}")	//Partie UUU
	public String updateConducteur(@Validated Conducteur conducteur, BindingResult bindingResult) {
		System.out.println("debut U");
		if(bindingResult.hasErrors()) {
			return "conducteur/conducteur";
		}
		conducteurRepository.save(conducteur);
		System.out.println("fin U");
		return "redirect:/pageConducteur";
	}
	
	//	DDDDDDDDDDDDDD
	@GetMapping("/deleteConducteur/{id_conducteur}")	// DDDD
	public String deleteConducteur(@PathVariable(value= "id_conducteur") Long id_conducteur, Model model) {
		conducteurRepository.deleteById(id_conducteur);
		return "redirect:/pageConducteur";
	}
	
	
}//Fin class
