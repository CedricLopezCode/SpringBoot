package com.example.demo.controller.angular;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Vehicule;
import com.example.demo.repository.ConducteurRepository;
import com.example.demo.repository.VehiculeRepository;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class VehiculeControllerAngular {

	@Autowired VehiculeRepository vehiculeRepository;
	@Autowired ConducteurRepository conducteurRepository;
	
	//RRRR CRUD
	@GetMapping("/listeAllVehicules/api")
	public List<Vehicule> listeVehicule() {
		return vehiculeRepository.findAll();
	}

	//CCCC CRUD
	@PostMapping("/ajoutVehicule/api")
	//@RequestMapping(value = "/ajoutVehicule/api", method = RequestMethod.POST)
	public Vehicule ajouterVehicule(@Validated @RequestBody Vehicule vehicule) {
		vehiculeRepository.save(vehicule);
		return vehiculeRepository.save(vehicule);
	}
	
	//UUUU CRUD
	@GetMapping("/vehiculeAModifier/api/{id}")
	@CrossOrigin(origins = "http://localhost:4200/")
	public Vehicule vehiculeAModifier(@PathVariable(value="id") Long id) {
		return vehiculeRepository.findById(id).get();
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
