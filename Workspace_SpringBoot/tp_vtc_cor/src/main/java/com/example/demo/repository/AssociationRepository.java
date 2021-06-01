package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Association;
import com.example.demo.model.Conducteur;
import com.example.demo.model.Vehicule;

public interface AssociationRepository extends JpaRepository<Association, Long>{

	/*Lucas: 
	SELECT count(*) FROM conducteur c WHERE NOT EXISTS (SELECT * FROM association a WHERE a.conducteur_id = c.id
	Vlad:
	SELECT count(*) FROM vehicule WHERE id NOT IN (SELECT vehicule_id FROM Association)
	SELECT count(*) FROM vehicule v WHERE NOT EXISTS (SELECT * FROM association a WHERE a.vehicule_id = v.id)
	SELECT id_conducteur FROM conducteur c WHERE NOT EXISTS (SELECT * FROM association a WHERE a.conducteur_id = c.id
	*/
	@Query(value="SELECT * FROM conducteur c LEFT JOIN association ON c.id_conducteur = association.conducteur_id_conducteur WHERE association.conducteur_id_conducteur IS NULL", nativeQuery = true)
	List<Conducteur> conducteurSansVehicule();

	@Query(value="SELECT * FROM vehicule v LEFT JOIN association ON v.id_vehicule = association.vehicule_id_vehicule WHERE association.vehicule_id_vehicule IS NULL", nativeQuery = true)
	List<Vehicule> vehiculeSansConducteur();
	
}
