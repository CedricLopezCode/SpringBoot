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

import com.example.demo.model.Association;
import com.example.demo.model.Conducteur;
import com.example.demo.model.Vehicule;
import com.example.demo.repository.AssociationRepository;
import com.example.demo.repository.ConducteurRepository;
import com.example.demo.repository.VehiculeRepository;

//@Controller
@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class AssociationControllerAngular {


	@Autowired ConducteurRepository conducteurRepository;
	@Autowired VehiculeRepository vehiculeRepository;
	@Autowired AssociationRepository associationRepository;
	
	//RRRR CRUD
	@GetMapping("/listeAllAssociations/api")
	public List<Association> listeAssociation() {
		return associationRepository.findAll();
	}
	@GetMapping("/listeConducteursSansVehicule/api")
	public List<Conducteur> listeConducteurSansVehicule() {
		return conducteurRepository.conducteurSansVehicule();
	}
	@GetMapping("/listeVehiculeSansConducteur/api")
	public List<Vehicule> listeVehiculeSansConducteur() {
		return vehiculeRepository.vehiculeSansConducteur();
	}
	//CCCC CRUD
	@PostMapping("/ajoutAssociation/api")
	public Association ajouterAssociation(@Validated @RequestBody Association association) {
		associationRepository.save(association);
		return associationRepository.save(association);
	}
	//UUUU CRUD
	@GetMapping("/updateAssociation/api/{id}") 
	public String ReadUpdate(@PathVariable(value= "id") Long id, Model model) {
		model.addAttribute("allAssociations", associationRepository.findAll());
		model.addAttribute("conducteurSansVehicule", conducteurRepository.conducteurSansVehicule());
		model.addAttribute("vehiculeSansConducteur", vehiculeRepository.vehiculeSansConducteur());
		
		Association assoc = associationRepository.findById(id).get();
		model.addAttribute("assocAModif", assoc);
		model.addAttribute("condAModif", assoc.getConducteur());
		model.addAttribute("vehAModif", assoc.getVehicule());

		return "association/association";
	}
	@PostMapping("/updateAssociation/api")
	public String CreateUpdate(@Validated Association association, BindingResult bindingResult) {
		if(bindingResult.hasErrors()){return "redirect:/pageAssociation";}
		//  U de CRUD
		associationRepository.save(association);
		return "redirect:/pageAssociation";
	}
	//DDDD CRUD
	@GetMapping("/deleteAssociation/api/{id}")
	public String deleteAssociation(@PathVariable(value="id") Long id, Model model) {
		model.addAttribute("assoASupp", associationRepository.findById(id));
		associationRepository.deleteById(id);
		return "redirect:/pageAssociation";
	}
}
