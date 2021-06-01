package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Conducteur;

public interface ConducteurRepository extends JpaRepository<Conducteur, Long>{

	@Query(value="SELECT * FROM conducteur c "
			+ "LEFT JOIN association "
			+ "ON c.id = association.conducteur_id "
			+ "WHERE association.conducteur_id IS NULL", 
			nativeQuery = true)
	List<Conducteur> conducteurSansVehicule();
}
