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

import com.example.demo.model.Conducteur;
import com.example.demo.repository.ConducteurRepository;
import com.example.demo.repository.VehiculeRepository;

@Controller
@RestController
public class ConducteurControllerAngular {


	@Autowired ConducteurRepository conducteurRepository;
	@Autowired VehiculeRepository vehiculeRepository;
	
	//RRRR CRUD
	@GetMapping("/listeAllConducteurs/api") //Version Angular
	@CrossOrigin(origins = "http://localhost:4200/")
	public List<Conducteur> listeConducteurAngular() {
		return conducteurRepository.findAll();
	}

		
	//CCCC CRUD
	@PostMapping("/ajoutConducteur/api")
	public String ajouterConducteur(@Validated Conducteur conducteur, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {return "home";}
		conducteurRepository.save(conducteur);
		return "redirect:/pageConducteur";
	}
	
	//UUUU CRUD
	@GetMapping("/updateConducteur/api/{id}")
	public String ReadUpdate(@PathVariable(value= "id") Long id, Model model) {
		//----------------------------------------
		System.out.println(conducteurRepository.findById(id));
		System.out.println(conducteurRepository.findById(id).get());
		//----------------------------------------
		model.addAttribute("allConducteurs", conducteurRepository.findAll());
		model.addAttribute("conducteurAModif", conducteurRepository.findById(id).get());
		return "conducteur/conducteur";
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
