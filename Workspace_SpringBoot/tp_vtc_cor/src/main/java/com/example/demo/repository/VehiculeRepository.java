package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long>{
/*
	@Query("SELECT * FROM vehicule "
			+ "LEFT JOIN association "
			+ "ON conducteur.id_vehicule = association.vehicule "
			+ "WHERE association.vehicule IS NULL")
	List<Vehicule> vehiculeSansConducteur();
	*/
	@Query(value="SELECT * FROM vehicule v LEFT JOIN association ON v.id_vehicule = association.vehicule_id_vehicule WHERE association.vehicule_id_vehicule IS NULL", nativeQuery = true)
	List<Vehicule> vehiculeSansConducteur();
}
