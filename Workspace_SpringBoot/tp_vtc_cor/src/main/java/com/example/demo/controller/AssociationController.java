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

import com.example.demo.model.Association;
import com.example.demo.model.Conducteur;
import com.example.demo.repository.AssociationRepository;
import com.example.demo.repository.ConducteurRepository;
import com.example.demo.repository.VehiculeRepository;

@Controller
public class AssociationController {

	@Autowired ConducteurRepository conducteurRepository;
	@Autowired VehiculeRepository vehiculeRepository;
	@Autowired AssociationRepository associationRepository;
	
	//RRRR CRUD
	@GetMapping("/pageAssociation")
	public String listeAssociation(Model model) {
		model.addAttribute("allConducteurs", conducteurRepository.findAll());
		model.addAttribute("allVehicules", vehiculeRepository.findAll());
		model.addAttribute("allAssociations", associationRepository.findAll());
		model.addAttribute("conducteurSansVehicule", conducteurRepository.conducteurSansVehicule());
		model.addAttribute("vehiculeSansConducteur", vehiculeRepository.vehiculeSansConducteur());
		return "association/association";
	}
	//CCCC CRUD
	@PostMapping("/pageAssociation")
	public String ajouterAssociation(@Validated Association association, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){
			System.out.println(bindingResult.toString());
			return "home";
		}
		System.out.println(association);
		associationRepository.save(association);
		return "redirect:/pageAssociation";
	}
	//UUUU CRUD
		@GetMapping("/updateAssociation/{id}") 
		public String ReadUpdate(@PathVariable(value= "id") Long id, Model model) {
			model.addAttribute("allAssociations", associationRepository.findAll());
			Association assoc = associationRepository.findById(id).get();
			model.addAttribute("uneAsso", assoc);
			model.addAttribute("condAModif", assoc.getConducteur());
			model.addAttribute("conducteurSansVehicule", conducteurRepository.conducteurSansVehicule());
			model.addAttribute("vehAModif", assoc.getVehicule());
			model.addAttribute("vehiculeSansConducteur", vehiculeRepository.vehiculeSansConducteur());

			return "association/association";
		}
		@PostMapping("/updateAssociation")
		public String CreateUpdate(@Validated Association association, BindingResult bindingResult) {
			if(bindingResult.hasErrors()){return "redirect:/pageAssociation";}
			//  U de CRUD
			associationRepository.save(association);
			return "redirect:/pageAssociation";
		}
	//DDDD CRUD
	@GetMapping("/deleteAssociation/{id}")
	public String deleteAssociation(@PathVariable(value="id") Long id) {
		System.out.println(id);
		conducteurRepository.deleteById(id);
		return "redirect:/pageAssociation";
	}
	
}
