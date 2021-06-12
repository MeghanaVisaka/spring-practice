package com.meghana.simcardmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.UniqueConstraint;

@Entity
public class SimCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int simcardId;

	private String simcardSerialNumber;

	private long simcardContact;

	@OneToOne
	private User user;

	public SimCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SimCard(int simcardId, String simcardSerialNumber, long simcardContact, User user) {
		super();
		this.simcardId = simcardId;
		this.simcardSerialNumber = simcardSerialNumber;
		this.simcardContact = simcardContact;
		this.user = user;
	}

	public int getSimcardId() {
		return simcardId;
	}

	public void setSimcardId(int simcardId) {
		this.simcardId = simcardId;
	}

	public String getSimcardSerialNumber() {
		return simcardSerialNumber;
	}

	public void setSimcardSerialNumber(String simcardSerialNumber) {
		this.simcardSerialNumber = simcardSerialNumber;
	}

	public long getSimcardContact() {
		return simcardContact;
	}

	public void setSimcardContact(long simcardContact) {
		this.simcardContact = simcardContact;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
