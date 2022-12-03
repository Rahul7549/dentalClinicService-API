package com.dentalClinic.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import com.dentalClinic.service.model.Patients;
import com.dentalClinic.service.serviceimp.patientsServiceImp;
@RestController
@RequestMapping("/app")
@Transactional
public class appController {
	
	@Autowired patientsServiceImp patientsServiceimp;
	
	@GetMapping("/patients")
	public ResponseEntity<?> getAllPatients()   
	{  
		return patientsServiceimp.getAllPatients();	
	} 
	
	@GetMapping("patients/{patientId}")
	public ResponseEntity<?> getPatientById(@PathVariable String  patientId){
		return patientsServiceimp.getPatientById(patientId);
	}
	
	@PostMapping("/patients")
	public Patients addPatient(@RequestBody Patients patient){
		return patientsServiceimp.addpatient(patient);
	}
	
	@PutMapping("patients")
	public Patients updatePatient(@RequestBody Patients patient){
		return patientsServiceimp.updatePatient(patient);
	}
	
	@DeleteMapping("/patients/{patientId}")
	public void deletePatient(@PathVariable String patientId){
		patientsServiceimp.deletePatient(patientId);
	}

}
