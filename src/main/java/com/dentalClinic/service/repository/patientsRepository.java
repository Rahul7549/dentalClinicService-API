package com.dentalClinic.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalClinic.service.model.Patients;


public interface patientsRepository extends MongoRepository<Patients, String> {

}
