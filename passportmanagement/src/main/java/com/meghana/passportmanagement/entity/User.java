package com.meghana.passportmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.PropertyGenerator;
import com.sun.istack.NotNull;

@Entity
//@JsonIdentityInfo(generator = PropertyGenerator.class, property = "userId")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@NotNull
	private String userFirstName;

	@NotNull
	private String userLastName;

	@NotNull
	private char userGender;

	@NotNull
	private String userAddress;

	@NotNull
	private long userContactNumber;

	@NonNull
	private String userName;

	@NonNull
	private String password;

	@OneToOne(mappedBy = "user")
	@JsonManagedReference
	@NonNull
	private Passport passport;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userFirstName, String userLastName, char userGender, String userAddress,
			long userContactNumber, String userName, String password, Passport passport) {
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

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userGender=" + userGender + ", userAddress=" + userAddress + ", userContactNumber="
				+ userContactNumber + ", userName=" + userName + ", password=" + password + ", passport=" + passport
				+ "]";
	}

}
