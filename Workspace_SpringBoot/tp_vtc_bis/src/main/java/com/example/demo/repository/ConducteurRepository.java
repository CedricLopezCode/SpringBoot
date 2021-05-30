package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Conducteur;

public interface ConducteurRepository extends JpaRepository<Conducteur, Long>{
 /*
	@Query("SELECT nom FROM conducteur LEFT JOIN association ON conducteur.id_conducteur = association.conducteur WHERE association.conducteur IS NULL")
	List<Conducteur> conducteurSansVehicule();
	*/
	/*
	Version Moussa
	@Query(value="SELECT c FROM conducteur c LEFT JOIN association ON c.id_conducteur = association.conducteur WHERE association.conducteur IS NULL", nativeQuery = true)
    List<Conducteur> conducteurSansVehicule();
	 */
	@Query(value="SELECT id_conducteur FROM conducteur c LEFT JOIN association ON c.id_conducteur = association.conducteur WHERE association.conducteur IS NULL", nativeQuery = true)
	List<Conducteur> conducteurSansVehicule();
}
