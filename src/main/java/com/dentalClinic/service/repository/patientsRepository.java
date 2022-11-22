package com.dentalClinic.service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalClinic.service.model.patients;

public interface patientsRepository extends MongoRepository<patients, String> {

}
