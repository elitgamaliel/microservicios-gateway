package com.systemjaade.patient.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.systemjaade.patient.model.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

	List<Patient> findAll();
	
}
