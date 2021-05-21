package com.example.demo.resume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

public class Resume_Home {
	
	@GetMapping("/") //juste afficher la page
	public String Home() {
		return "home";   //page par défault
	}
	
	@GetMapping("/")
	@RequestMapping(value="/XXX", method = RequestMethod.GET) /* == @GetMapping("/")*/
	
	@PostMapping("/XXX")
	@RequestMapping(value="/XXX", method = RequestMethod.POST) /* == @PostMapping("/")*/
	
	public String Ajout(@Validated User user, BindingResult bindingResult) { //bind si erreur
	if(bindingResult.hasErrors()) {
		return "XXXXX";
	}
	
	public String Ajout(Model model) {   Model ????????????? 
	model.addAttribute("user", new User());
		
		
		
		@ResponseBody	
}
	
	
	
				//				Partie html
								
								
		//Formulaire
	<form class="form_user flex-col-center" method="post" th:action="@{/ajout}" th:object="${user}"> // Thymeleaf 
		//Id
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) // == y s'en occupe pas
	private int id;
	@Column(name="nom") // == alias en sql
	private String nom;
}
	
	
	
	//					A eclaircir
	
@ResponseBody	
	
@Autowired UserRepository userRepository;         	????  Autowire

	public String Ajout(Model model) {				????  Model
		model.addAttribute("user", new User());
	}
	public String Ajout(@Validated User user, BindingResult bindingResult) {    ???? Validated     	
		
		if(bindingResult.hasErrors()) {
			return "user/form";
		}
	
	

		