package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long>{
/*
	@Query(
			SELECT * FROM vehicule 
			LEFT JOIN association_vehicule_conducteur
			WHERE vehicule IS NOT NULL)
	List<Vehicule> vehiculeSansConducteur();
	*/
	
}
