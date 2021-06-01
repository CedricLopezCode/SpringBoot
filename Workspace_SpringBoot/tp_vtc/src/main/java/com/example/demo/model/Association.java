package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Association { 
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	/*Vesion Initiale
	private Long conducteur;
	private Long vehicule;
	*/
	
	//@Column(name="conducteur") 
	@ManyToOne
	private Conducteur conducteur;
	
	//@Column(name="vehicule") 
	@ManyToOne
	private Vehicule vehicule;
	
	
	public Association() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Association(Conducteur conducteur, Vehicule vehicule) {
		super();
		this.conducteur = conducteur;
		this.vehicule = vehicule;
	}
	public Association(Long id, Conducteur conducteur, Vehicule vehicule) {
		super();
		this.id = id;
		this.conducteur = conducteur;
		this.vehicule = vehicule;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
		return "[id_association=" + id + ", conducteur=" + conducteur + ", vehicule=" + vehicule
				+ "]";
	}
	
}
