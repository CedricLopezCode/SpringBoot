package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Conducteur;

public interface ConducteurRepository extends JpaRepository<Conducteur, Long>{
	/*
	@Query(
			SELECT * FROM conducteur 
			LEFT JOIN association_vehicule_conducteur
			WHERE conducteur IS NULL)
	List<Vehicule> conducteurSansVehicule();
	*/
}