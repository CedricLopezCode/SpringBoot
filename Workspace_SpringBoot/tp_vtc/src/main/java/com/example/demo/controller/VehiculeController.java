package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Vehicule;
import com.example.demo.repository.VehiculeRepository;

@Controller
public class VehiculeController {

	@Autowired VehiculeRepository vehiculeRepository;
	
	//CCCCCCCCCCCCCCCCCCCCCCCCCCCC
	@PostMapping("/ajoutVehicule")  //  CCC
	public String ajoutVehicule(@Validated Vehicule vehicule, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "home";
		}
		vehiculeRepository.save(vehicule);
		return "redirect:/pageVehicule";
	}
	
	//RRRRRRRRRRRRRRRRRRRRRRRR
	@GetMapping("/pageVehicule")	// RRR
	public String readAllVehicules(Model model) {
		model.addAttribute("allVehicules", vehiculeRepository.findAll());
		return "vehicule/vehicule";
	}
	
	//	UUUUUUUUUUUUUUUU
	@GetMapping("/updateVehicule/{id_vehicule}")	// Partie RRR 
	public String recupVehicule(@PathVariable(value= "id_vehicule") Long id_vehicule, Model model, BindingResult bindingResult) {
		model.addAttribute("unVehicule", vehiculeRepository.findById(id_vehicule).get());
		
		return "/pageVehicule";
	}
	@PostMapping("/updateVehicule/{id_vehicule}")	//Partie UUU
	public String updateVehicule(@Validated Vehicule vehicule, BindingResult bindingResult) {
		System.out.println("debut U");
		if(bindingResult.hasErrors()) {
			return "vehicule/vehicule";
		}
		vehiculeRepository.save(vehicule);
		System.out.println("fin U");
		return "redirect:/pageVehicule";
	}
	
	//	DDDDDDDDDDDDDD
	@GetMapping("/deleteVehicule/{id_vehicule}")	// DDDD
	public String deleteVehicule(@PathVariable(value= "id_vehicule") Long id_vehicule, Model model) {
		vehiculeRepository.deleteById(id_vehicule);
		return "redirect:/pageVehicule";
	}
	
	
}//Fin class
