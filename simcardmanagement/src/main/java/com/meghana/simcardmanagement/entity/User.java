package com.meghana.simcardmanagement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userFullName;

	private char userGender;

	private String userAddress;

	private String userIdProofNumber;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<SimCard> simcardsList;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String userFullName, char userGender, String userAddress, String userIdProofNumber,
			List<SimCard> simcardsList) {
		super();
		this.userId = userId;
		this.userFullName = userFullName;
		this.userGender = userGender;
		this.userAddress = userAddress;
		this.userIdProofNumber = userIdProofNumber;
		this.simcardsList = simcardsList;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
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

	public String getUserIdProofNumber() {
		return userIdProofNumber;
	}

	public void setUserIdProofNumber(String userIdProofNumber) {
		this.userIdProofNumber = userIdProofNumber;
	}

	public List<SimCard> getSimcardsList() {
		return simcardsList;
	}

	public void setSimcardsList(List<SimCard> simcardsList) {
		this.simcardsList = simcardsList;
	}

}
