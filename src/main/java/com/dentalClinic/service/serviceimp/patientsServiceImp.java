package com.dentalClinic.service.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dentalClinic.service.model.patients;
import com.dentalClinic.service.repository.*;
import com.dentalClinic.*;

@Service
public class patientsServiceImp {

	@Autowired patientsRepository patientsRepository ;
	
	public ResponseEntity<?> getAllPatients()   
	{ 
		List<patients> patients=patientsRepository.findAll();
		if(patients.size()>0)
			return new ResponseEntity<List<patients>>(patients,HttpStatus.OK);
		else
			return new ResponseEntity<>("No patients available",HttpStatus.NOT_FOUND);
	}
	
	
}
