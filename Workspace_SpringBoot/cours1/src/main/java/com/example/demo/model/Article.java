package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Article {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titre;
	private String resume;
	
	
	@ManyToOne //car plusieurs articles peuvent etre ecrits par 1 user
	private User user;
	
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Article(String titre, String resume, User user) {
		super();
		this.titre = titre;
		this.resume = resume;
		this.user = user;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	} 

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}


	@Override
	public String toString() {
		return "Article [id=" + id + ", titre=" + titre + ", resume=" + resume + ", user=" + user + "]";
	}


	
	
}
