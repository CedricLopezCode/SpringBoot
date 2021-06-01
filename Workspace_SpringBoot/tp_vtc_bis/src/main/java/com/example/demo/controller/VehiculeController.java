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
import com.example.demo.repository.ConducteurRepository;
import com.example.demo.repository.VehiculeRepository;

@Controller
public class VehiculeController {

	@Autowired VehiculeRepository vehiculeRepository;
	@Autowired ConducteurRepository conducteurRepository;
	
	//RRRR CRUD
	@GetMapping("/pageVehicule")
	public String listeVehicule(Model model) {
		model.addAttribute("allVehicules", vehiculeRepository.findAll());
		return "vehicule/vehicule";
	}
	//CCCC CRUD
	@PostMapping("/ajoutVehicule")
	public String ajouterVehicule(@Validated Vehicule vehicule, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {return "home";}
		vehiculeRepository.save(vehicule);
		return "redirect:/pageVehicule";
	}
	//UUUU CRUD
	@GetMapping("/updateVehicule/{id}")
	public String ReadUpdate(@PathVariable(value="id") Long id, Model model) {
		model.addAttribute("allVehicules", vehiculeRepository.findAll());
		model.addAttribute("vehiAModif", vehiculeRepository.findById(id));
		return "vehicule/vehicule";
	}
	@PostMapping("/updateVehicule")
	public String CreateUpdate(@Validated Vehicule vehicule, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {return "home";}
		vehiculeRepository.save(vehicule);
		return "redirect:/pageVehicule";
	}
	//DDDD CRUD
	@GetMapping("/deleteVehicule/{id}")
	public String deleteVehicule(@PathVariable(value="id") Long id) {
		vehiculeRepository.deleteById(id);
		return "redirect:/pageVehicule";
	}
}
