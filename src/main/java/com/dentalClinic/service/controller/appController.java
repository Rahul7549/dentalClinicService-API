package com.dentalClinic.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	

}
