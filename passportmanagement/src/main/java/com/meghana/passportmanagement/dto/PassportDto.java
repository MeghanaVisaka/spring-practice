package com.meghana.passportmanagement.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;

@JsonIdentityInfo(generator = PropertyGenerator.class, property = "passportId")
public class PassportDto {

	private int passportId;

	private String passportNumber;

//	@JsonBackReference
	private UserDto user;

	public PassportDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PassportDto(int passportId, String passportNumber, UserDto user) {
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

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "PassportDto [passportId=" + passportId + ", passportNumber=" + passportNumber + ", user=" + user + "]";
	}

}
