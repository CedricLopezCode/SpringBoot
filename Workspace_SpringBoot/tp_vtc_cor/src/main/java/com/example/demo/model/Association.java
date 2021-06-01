package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Association { 
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_association;
	
	/*Vesion Initiale
	private Long conducteur;
	private Long vehicule;
	*/
	
	@ManyToOne
	private Conducteur conducteur;
	
	@ManyToOne
	private Vehicule vehicule;
	
	
	public Association() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Association(Long id_association, Conducteur conducteur, Vehicule vehicule) {
		super();
		this.id_association = id_association;
		this.conducteur = conducteur;
		this.vehicule = vehicule;
	}


	public Long getId_association() {
		return id_association;
	}
	public void setId_association(Long id_association) {
		this.id_association = id_association;
	}
	public Conducteur getConducteur() {
		return conducteur;
	}
	public void setConducteur(Conducteur conducteur) {
		this.conducteur = conducteur;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}


	@Override
	public String toString() {
		return "Association [id_association=" + id_association + ", conducteur=" + conducteur + ", vehicule=" + vehicule
				+ "]";
	}
	
}
