package com.meghana.passportmanagement.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;

@JsonIdentityInfo(generator = PropertyGenerator.class, property="userId")
public class UserDto {

	private int userId;

	private String userFirstName;

	private String userLastName;

	private char userGender;

	private String userAddress;

	private long userContactNumber;

	private String userName;

	private String password;

//	@JsonManagedReference
	private PassportDto passport;

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(int userId, String userFirstName, String userLastName, char userGender, String userAddress,
			long userContactNumber, String userName, String password, PassportDto passport) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userGender = userGender;
		this.userAddress = userAddress;
		this.userContactNumber = userContactNumber;
		this.userName = userName;
		this.password = password;
		this.passport = passport;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public char getUserGender() {
		return userGender;
	}

	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public long getUserContactNumber() {
		return userContactNumber;
	}

	public void setUserContactNumber(long userContactNumber) {
		this.userContactNumber = userContactNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public PassportDto getPassport() {
		return passport;
	}

	public void setPassport(PassportDto passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userGender=" + userGender + ", userAddress=" + userAddress + ", userContactNumber="
				+ userContactNumber + ", userName=" + userName + ", password=" + password + ", passport=" + passport
				+ "]";
	}

}
