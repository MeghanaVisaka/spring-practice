package com.meghana.passportmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.sun.istack.NotNull;

@Entity
//@JsonIdentityInfo(generator = PropertyGenerator.class, property = "passportId")
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passportId;

	@NotNull
	private String passportNumber;

	@OneToOne
	@JsonBackReference
	@NotNull
	private User user;

	public Passport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passport(int passportId, String passportNumber, User user) {
		super();
		this.passportId = passportId;
		this.passportNumber = passportNumber;
		this.user = user;
	}

	public int getPassportId() {
		return passportId;
	}

	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportNumber=" + passportNumber + ", user=" + user + "]";
	}
	
	

}
