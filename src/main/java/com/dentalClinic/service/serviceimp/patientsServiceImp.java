package com.dentalClinic.service.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dentalClinic.service.model.Patients;
import com.dentalClinic.service.repository.*;
import com.dentalClinic.*;

@Service
public class patientsServiceImp {

	@Autowired patientsRepository patientsRepository ;
	
	public ResponseEntity<?> getAllPatients()   
	{ 
		List<Patients> patients=patientsRepository.findAll();
		if(patients.size()>0)
			return new ResponseEntity<List<Patients>>(patients,HttpStatus.OK);
		else
			return new ResponseEntity<>("No patients available",HttpStatus.NOT_FOUND);
	}
	
	
	public ResponseEntity<?> getPatientById(String patientId){
		Optional<Patients> patient= patientsRepository.findById(patientId);
		if(!patient.isEmpty()) {
			return new ResponseEntity<>(patient,HttpStatus.OK);
		}
		else
			return new  ResponseEntity<>("No patient available with this patient_Id",HttpStatus.NOT_FOUND);
		
	 }
	
	public Patients updatePatient(Patients patient){
		return patientsRepository.findById(patient.getId())
				.map(updatedPatient->{
					updatedPatient.setAddre(patient.getAddre());
					updatedPatient.setId(patient.getId());
					updatedPatient.setFirstName(patient.getFirstName());
					updatedPatient.setLastName(patient.getLastName());
					return patientsRepository.save(updatedPatient);
				})
				.orElseGet(()->{
					return patientsRepository.save(patient);
				});
				
	}
	
	public void deletePatient(String patientid) {
		patientsRepository.deleteById(patientid);
	}
	
	public Patients addpatient(Patients newPatient){
		return patientsRepository.save(newPatient);
	}
	

	
	
}
