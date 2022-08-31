package com.systemjaade.patient.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.systemjaade.patient.model.Patient;
import com.systemjaade.patient.service.PatientService;

@Controller
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Patient>> listarPacientes(){
		List<Patient> pacientes = service.listAll();
		if(pacientes.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(pacientes);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Patient> obtenerMoto(@PathVariable("id") int id){
		Patient paciente = service.getPatientById(id);
		if(paciente == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(paciente);
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<Patient> guardarPaciente(@RequestBody Patient paciente){
		Patient newPatient = service.save(paciente);
		return ResponseEntity.ok(newPatient);
	}
}
