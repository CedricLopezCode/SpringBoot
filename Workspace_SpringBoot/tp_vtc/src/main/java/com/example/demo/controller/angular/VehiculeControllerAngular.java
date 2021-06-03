package com.example.demo.controller.angular;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vehicule;
import com.example.demo.repository.ConducteurRepository;
import com.example.demo.repository.VehiculeRepository;

@Controller
@RestController
public class VehiculeControllerAngular {

	@Autowired VehiculeRepository vehiculeRepository;
	@Autowired ConducteurRepository conducteurRepository;
	
	//RRRR CRUD
	@GetMapping("/listeAllVehicules/api")
	@CrossOrigin(origins = "http://localhost:4200/")
	public List<Vehicule> listeVehicule() {
		return vehiculeRepository.findAll();
	}
	
	
	//CCCC CRUD
	@PostMapping("/ajoutVehicule/api")
	public String ajouterVehicule(@Validated Vehicule vehicule, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {return "home";}
		vehiculeRepository.save(vehicule);
		return "redirect:/pageVehicule";
	}
	
	//UUUU CRUD
	@GetMapping("/updateVehicule/api/{id}")
	public String ReadUpdate(@PathVariable(value="id") Long id, Model model) {
		model.addAttribute("allVehicules", vehiculeRepository.findAll());
		model.addAttribute("vehiculeAModif", vehiculeRepository.findById(id).get());
		return "vehicule/vehicule";
	}
	@PostMapping("/updateVehicule/api")
	public String CreateUpdate(@Validated Vehicule vehicule, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {return "home";}
		vehiculeRepository.save(vehicule);
		return "redirect:/pageVehicule";
	}
	
	//DDDD CRUD
	@GetMapping("/deleteVehicule/api/{id}")
	public String deleteVehiculer(@PathVariable(value="id") Long id, Model model) {
		model.addAttribute("vehitASupp", vehiculeRepository.findById(id));
		vehiculeRepository.deleteById(id);
		return "redirect:/pageConducteur";
	}
}
