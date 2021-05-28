package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Association;
import com.example.demo.repository.AssociationRepository;
import com.example.demo.repository.ConducteurRepository;
import com.example.demo.repository.VehiculeRepository;


@Controller
public class AssocController {
	
	@Autowired ConducteurRepository conducteurRepository;
	@Autowired VehiculeRepository vehiculeRepository;
	@Autowired AssociationRepository associationRepository;
	
	
	//CCCCCCCCCCCCCCCCCCCCCCCCCCCC
	@PostMapping("/ajoutAssociation")  //  CCC
	public String ajoutAssociation(@Validated Association association, BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return "home";
		}
		associationRepository.save(association);
		return "redirect:/pageAssociation";
	}
	
	//RRRRRRRRRRRRRRRRRRRRRRRR
	@GetMapping("/pageAssociation")	// RRR
	public String readAllAssociations(Model model) {
		model.addAttribute("allConducs", conducteurRepository.findAll());
		model.addAttribute("allVehicules", vehiculeRepository.findAll());
		model.addAttribute("allAssociations", associationRepository.findAll());
		model.addAttribute("conducteurSansVehicule", associationRepository.conducteurSansVehicule());
		model.addAttribute("vehiculeSansConducteur", associationRepository.vehiculeSansConducteur());
		
		return "association/association";
	}
	
	//	UUUUUUUUUUUUUUUU
	@GetMapping("/updateAssociation/{id_association}")	// Partie RRR 
	public String recupAssociation(@PathVariable(value= "association") Long id_association, Model model, BindingResult bindingResult) {
		model.addAttribute("unAssociation", associationRepository.findById(id_association).get());
		
		return "/pageAssociation";
	}
	@PostMapping("/updateAssociation/{id_association}")	//Partie UUU
	public String updateAssociation(@Validated Association association, BindingResult bindingResult) {
		System.out.println("debut U");
		if(bindingResult.hasErrors()) {
			return "association/association";
		}
		associationRepository.save(association);
		System.out.println("fin U");
		return "redirect:/pageAssociation";
	}
	
	//	DDDDDDDDDDDDDD
	@GetMapping("/deleteAssociation/{id_association}")	// DDDD
	public String deleteAssociation(@PathVariable(value= "id_association") Long id_association, Model model) {
		associationRepository.deleteById(id_association);
		return "redirect:/pageAssociation";
	}

}//Fin class
