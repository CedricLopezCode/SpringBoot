package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Conducteur {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_conducteur;
	private String prenom;
	private String nom;
	
	@ManyToMany
	@JoinTable(
		name= "association_vehicule_conducteur",
		joinColumns = {@JoinColumn(name="conducteur")},
		inverseJoinColumns = {@JoinColumn(name="vehicule")}
	)
	private List<Vehicule> vehicule;
	
	
	public Conducteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Conducteur(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}
	public Conducteur(Long id_conducteur, String prenom, String nom) {
		super();
		this.id_conducteur = id_conducteur;
		this.prenom = prenom;
		this.nom = nom;
	}
	public Conducteur(Long id_conducteur, String prenom, String nom, List<Vehicule> vehicule) {
		super();
		this.id_conducteur = id_conducteur;
		this.prenom = prenom;
		this.nom = nom;
		this.vehicule = vehicule;
	}


	public List<Vehicule> getVehicules() {
		return vehicule;
	}


	public void setVehicules(List<Vehicule> vehicules) {
		this.vehicule = vehicule;
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
		return id_conducteur +" "+ prenom +" "+ nom ;
	}
	
	
	
}
