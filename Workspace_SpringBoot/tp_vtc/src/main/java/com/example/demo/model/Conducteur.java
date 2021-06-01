package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
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
	private Long id;
	private String prenom;
	private String nom;
	
	/*Version Initiale
	  @ManyToMany(cascade = CascadeType.ALL)
		@JoinTable(name = "association",
			joinColumns = {@JoinColumn(name = "conducteur")},
			inverseJoinColumns = {@JoinColumn(name = "vehicule")})
	private List<Vehicule> vehicules;
	 */
	 
	public Conducteur() { 
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Conducteur(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		return "[id_conducteur=" + id + ", prenom=" + prenom + ", nom=" + nom + "]";
	}
	public String toStringResume() {
		return prenom + " " + nom;
	}
	
}
