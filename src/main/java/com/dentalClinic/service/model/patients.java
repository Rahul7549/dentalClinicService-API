package com.dentalClinic.service.model;

import javax.persistence.Column;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author rahul
 *
 */
@Document("patients")
public class patients {

	@Id
	private String id;

	@Column(name="firstName")
    private String firstName;
	
	@Column(name="lastName")
    private String lastName;
	
	@Column(name="address")
    private String addre;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddre() {
		return addre;
	}

	public void setAddre(String addre) {
		this.addre = addre;
	}

    
}
