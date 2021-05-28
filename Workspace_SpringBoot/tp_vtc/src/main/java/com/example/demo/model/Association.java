package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Association {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_association;
	private Conducteur conducteur;
	private Vehicule vehicule;
	
	
	
	public Association() {
		super();
		// TODO Auto-generated constructor stub
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

	public Long getId_association() {
		return id_association;
	}

	public void setId_association(Long id_association) {
		this.id_association = id_association;
	}

	@Override
	public String toString() {
		return "Association [id_association=" + id_association + ", conducteur=" + conducteur + ", vehicule=" + vehicule
				+ "]";
	}
	public String toStringResume() {
		return "Assoc: "+id_association +"\nConducteur: "+  conducteur.toStringResume() +"\nVehicule "+ vehicule.toStringResume();
	}
	
	
}
