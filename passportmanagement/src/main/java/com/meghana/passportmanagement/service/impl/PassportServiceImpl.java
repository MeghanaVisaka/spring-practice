package com.meghana.passportmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meghana.passportmanagement.entity.Passport;
import com.meghana.passportmanagement.entity.User;
import com.meghana.passportmanagement.repository.PassportRepository;
import com.meghana.passportmanagement.repository.UserRepository;
import com.meghana.passportmanagement.service.PassportService;

@Service
public class PassportServiceImpl implements PassportService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	PassportRepository passportRepository;

	@Override
	public Passport assignPassportToUser(Passport passport, String username) {

		User fetchedUser = userRepository.findByUserName(username);
		passport.setUser(fetchedUser);
		Passport savedPassport = passportRepository.save(passport);
		return savedPassport;
	}

	@Override
	public Passport fetchPassport(String passportNumber) {

		Passport fetchedPassport = passportRepository.findByPassportNumber(passportNumber);

		return fetchedPassport;
	}

}
