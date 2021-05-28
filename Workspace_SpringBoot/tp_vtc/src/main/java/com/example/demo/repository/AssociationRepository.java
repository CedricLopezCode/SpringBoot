package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Association;
import com.example.demo.model.Conducteur;
import com.example.demo.model.Vehicule;

public interface AssociationRepository extends JpaRepository<Association, Long>{

	@Query(
		SELECT * FROM conducteur 
		LEFT JOIN association_vehicule_conducteur
		WHERE conducteur IS NULL)
	List<Conducteur> conducteurSansVehicule();
	
	@Query(
			SELECT * FROM vehicule 
			LEFT JOIN association_vehicule_conducteur
			WHERE vehicule IS NULL)
	List<Vehicule> vehiculeSansConducteur();
	
	
	
	
}
