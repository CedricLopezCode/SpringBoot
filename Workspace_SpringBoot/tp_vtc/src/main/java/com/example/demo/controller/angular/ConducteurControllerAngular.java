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

import com.example.demo.model.Conducteur;
import com.example.demo.repository.ConducteurRepository;
import com.example.demo.repository.VehiculeRepository;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ConducteurControllerAngular {


	@Autowired ConducteurRepository conducteurRepository;
	@Autowired VehiculeRepository vehiculeRepository;
	
	//RRRR CRUD
	@GetMapping("/listeAllConducteurs/api") //Version Angular
	public List<Conducteur> listeConducteurAngular() {
		return conducteurRepository.findAll();
	}
	@PostMapping("/ajoutConducteur/api")
	public Conducteur ajouterConducteur(@Validated @RequestBody Conducteur conducteur) {
		conducteurRepository.save(conducteur);
		return conducteurRepository.save(conducteur);
	}
	
	//UUUU CRUD
	@GetMapping("/recupCondAModif/api/{id}") 
	public Conducteur recupCondAModif(@PathVariable(value="id") Long id) {
		return conducteurRepository.findById(id).get();
	}

	@PostMapping("/updateConducteur/api")
	public String CreateUpdate(@Validated Conducteur conducteur, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){return "home";}
		conducteurRepository.save(conducteur);
		return "redirect:/pageConducteur";
	}
	
	//DDDD CRUD
	@GetMapping("/deleteConducteur/api/{id}")
	public String deleteConducteur(@PathVariable(value="id") Long id, Model model) {
		model.addAttribute("conductASupp", conducteurRepository.findById(id));
		conducteurRepository.deleteById(id);
		return "redirect:/pageConducteur";
	}
	/*
	//Version Camille Verifie l'existence avant et delete brut
	@GetMapping("/deleteC/{id}")
    public String delete(@PathVariable(value = "id") Long conducteurId) throws AttributeNotFoundException {
        Conducteur conducteur = conducteurRepository.findById(conducteurId).orElseThrow(() -> new AttributeNotFoundException("Id non trouvé " +conducteurId)) ;
        conducteurRepository.delete(conducteur);
        return "redirect:/";
    }
    */
}
