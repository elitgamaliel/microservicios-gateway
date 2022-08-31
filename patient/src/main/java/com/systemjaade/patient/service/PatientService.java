package com.systemjaade.patient.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systemjaade.patient.model.Patient;
import com.systemjaade.patient.repository.PatientRepository;

@Service
public class PatientService {
	@Autowired
	private PatientRepository repository;
	
	public List<Patient> listAll(){
		return repository.findAll();
	}
	
	public Patient getPatientById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public Patient save(Patient patient) {
		Patient newPatient = repository.save(patient);
		return newPatient;
	}
	 
}
