package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Association {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_association; 
	private Long id_conducteur;
	private Long id_vehicule;
	
	public Association() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Association [id_vehicule=" + id_association + ", conducteur=" + conducteur + ", vehicule=" + vehicule
				+ "]";
	}
	
	
	
	
	
	
}
