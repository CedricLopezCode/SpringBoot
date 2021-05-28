package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Article;
import com.example.demo.repository.ArticleRepository;
import com.example.demo.repository.UserRepository;

@Controller
public class ArticleController {

	@Autowired UserRepository userRepository;
	@Autowired ArticleRepository articleRepository;
	
	@GetMapping("/ajoutArticle")
	public String ajoutArticle(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "article/formArticle";
	}
	
	@PostMapping("/ajoutArticle")
	public String ajoutArticle(@Validated Article article, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			System.out.println(bindingResult);
			return "article/formArticle";
		}
		System.out.println(article);
		articleRepository.save(article);
		return "redirect:/listeArticle";
	}
	@GetMapping("/listeArticle")
	public String listeArticle(Model model) {
		model.addAttribute("allArticles", articleRepository.findAll());
		return "article/listeArticle";
	}
	@GetMapping("/lireArticle/{id}")
	public String lireArticle(@PathVariable(value= "id") Long articleId, Model model) {
		System.out.println(articleId);
		model.addAttribute("detailArticle", articleRepository.findById(articleId).get());
		return "article/lireArticle";
	}
}
