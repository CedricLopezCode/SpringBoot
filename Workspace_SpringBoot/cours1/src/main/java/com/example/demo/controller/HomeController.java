package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	//@GetMapping("/") //juste afficher la page
	//@RequestMapping(value="/ajout", method = RequestMethod.GET) /* == @GetMapping("/")*/
	
	//@PostMapping("/ajout")
	//@RequestMapping(value="/ajout", method = RequestMethod.POST) /* == @PostMapping("/")*/
	//public String Ajout(@Validated User user, BindingResult bindingResult) //bind si erreur


	//public String Ajout(Model model) {
	//model.addAttribute("user", new User());
		
			
			
	//@ResponseBody	
	
	/* redondant avec user donc inutile
	@GetMapping("/ajouter")	
	public String Ajouter() {
		return "user/form";
	}
	 */
	
	
	@GetMapping("/")
	public String Home() {
		return "home";
	}


}//Fin HomeController
