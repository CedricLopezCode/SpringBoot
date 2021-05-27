package com.example.demo.resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

public class Resume_Home {
	
	@GetMapping("/") //juste afficher la page // "XXXX" == nom qu'on veut afficher dans l'url
	public String Home() {
		return "home";   //va chercher ce nom de html dans template
	}
	
	@GetMapping("/") == @RequestMapping(value="/XXX", method = RequestMethod.GET)
	@PostMapping("/XXX") == @RequestMapping(value="/XXX", method = RequestMethod.POST)
	
	public String Ajout(@Validated User user, BindingResult bindingResult) { //bind si erreur
	if(bindingResult.hasErrors()) {
		return "XXXXX";
	}
	
	public String Ajout(Model model) {   Model ????????????? 
	model.addAttribute("user", new User());
		
		
		
		@ResponseBody	//Ne va pas chercher un template qui a ce nom.... 
	//...mais considérer le contenu comme la Vue elle-meme
}
	
	
	
				//				Partie html
								
	<html xmlns:th="http://www.thymeleaf.org/"> //pour utiliser thymeleaf // th == alias
	
		//Formulaire
	<form method="post" th:action="@{/ajout}" th:object="${user}"> // Thymeleaf 
			//@ envoi de données   		$ recup données
	

	
	
	
	//					A eclaircir
	
@ResponseBody	
	
@Autowired UserRepository userRepository;         	????  Autowire   Fait le new automatiquement ???

	public String Ajout(Model model) {	Model == session			????  Model
		model.addAttribute("user", new User());
	}
	public String Ajout(@Validated User user, BindingResult bindingResult) {    ???? Validated     	
		
		if(bindingResult.hasErrors()) {
			return "user/form";
		}
	
	//			JPA
	package com.example.demo.model;

	import javax.persistence.Column;
	
	@Entity //== Analysé pour interagire avec la DB
	public class User {

		@Id // == informer clé primaire
		@GeneratedValue(strategy = GenerationType.IDENTITY) // == y s'en occupe pas  parenthese ????????
		private int id;
		@Column(name="nom") // == alias en sql
		private String nom;
		private String prenom;
		
		
		public User() {super();	}

		
	}

	public interface UserRepository extends JpaRepository<User, Long> {}
	
	POURQUOI UNE INTERFACE SANS @Override et POURQUOI CE EXTENDS ?
			C EST A L ENVERS ???!!!
		