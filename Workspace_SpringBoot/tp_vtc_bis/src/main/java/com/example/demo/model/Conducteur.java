package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conducteur {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_conducteur;
	private String prenom;
	private String nom;
	
	
	public Conducteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Conducteur(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}
	
	
	public Long getId_conducteur() {
		return id_conducteur;
	}
	public void setId_conducteur(Long id_conducteur) {
		this.id_conducteur = id_conducteur;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	@Override
	public String toString() {
		return "Conducteur [id_conducteur=" + id_conducteur + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	public String toStringResume() {
		return "Conducteur: " + prenom + " " + nom;
	}
	
}
