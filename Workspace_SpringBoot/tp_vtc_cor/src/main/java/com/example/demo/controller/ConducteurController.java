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
import com.example.demo.repository.VehiculeRepository;

@Controller
public class ConducteurController {

	@Autowired ConducteurRepository conducteurRepository;
	@Autowired VehiculeRepository vehiculeRepository;
	
	//RRRR CRUD
	@GetMapping("/pageConducteur")
	public String listeConducteur(Model model) {
		model.addAttribute("allConducteurs", conducteurRepository.findAll());
		return "conducteur/conducteur";
	}
	
	//CCCC CRUD
	@PostMapping("/ajoutConducteur")
	public String ajouterConducteur(@Validated Conducteur conducteur, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {return "home";}
		conducteurRepository.save(conducteur);
		return "redirect:/pageConducteur";
	}
	
	//UUUU CRUD
	@GetMapping("/updateConducteur/{id}") //V1
	public String ReadUpdate(@PathVariable(value= "id") Long id, Model model) {
		model.addAttribute("unconducteur", conducteurRepository.findById(id).get());
		model.addAttribute("allConducteurs", conducteurRepository.findAll());
		return "conducteur/conducteur";
	}
	/*@PostMapping("/updateConducteur")
	public String CreateUpdate(@Validated Conducteur conducteur, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){return "redirect:/pageConducteur";}
		//  U de CRUD
		conducteurRepository.save(conducteur);
		return "redirect:/pageConducteur";
	} */
	
	//DDDD CRUD
	@GetMapping("/deleteConducteur/{id}")
	public String deleteConducteur(@PathVariable(value="id") Long id, Model model) {
		model.addAttribute("conductASupp", conducteurRepository.findById(id));
		conducteurRepository.deleteById(id);
		return "redirect:/pageConducteur";
	}
}
