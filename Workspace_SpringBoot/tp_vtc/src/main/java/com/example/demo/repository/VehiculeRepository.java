package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long>{

	@Query(value="SELECT * FROM vehicule v "
			+ "LEFT JOIN association "
			+ "ON v.id = association.vehicule_id "
			+ "WHERE association.vehicule_id IS NULL", 
			nativeQuery = true)
	List<Vehicule> vehiculeSansConducteur();
}
