package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Vehicule {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marque;
	private String modele;
	private String couleur;
	private String immatriculation;
	
	/*Version Initiale
	 @ManyToMany(mappedBy = "vehicules")
	private List<Conducteur> conducteurs;
	*/
	 

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicule(String marque, String modele, String couleur, 
			String immatriculation) {
		super();
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.immatriculation = immatriculation;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}


	@Override
	public String toString() {
		return "[id_vehicule=" + id + ", marque=" + marque + ", modele=" + modele + ", couleur="
				+ couleur + ", immatriculation=" + immatriculation + "]";
	}
	public String toStringResume() {
		return marque + " " + modele + " "+ couleur + " " + immatriculation;
	}
	
}
