package com.meghana.passportmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meghana.passportmanagement.entity.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Integer> {
	
	Passport findByPassportNumber(String passportNumber);

}
