package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Association;

public interface AssociationRepository extends JpaRepository<Association, Long>{

}
