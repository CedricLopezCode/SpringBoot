package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Conducteur;

public interface ConducteurRepository extends JpaRepository<Conducteur, Long>{
/* 
	@Query("SELECT * FROM conducteur "
			+ "LEFT JOIN association "
			+ "ON conducteur.id_conducteur = association.conducteur "
			+ "WHERE association.conducteur IS NULL")
	List<Conducteur> conducteurSansVehicule();
	*/
}
