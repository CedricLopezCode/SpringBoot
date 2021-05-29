package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Conducteur;

public interface ConducteurRepository extends JpaRepository<Conducteur, Long>{
/*
	@Query(
		"SELECT * FROM conducteur "
		+ "LEFT JOIN association_vehicule_conducteur "
		+ "WHERE conducteur IS NOT NULL")
	List<Conducteur> conducteurSansVehicule();
	*/
}
