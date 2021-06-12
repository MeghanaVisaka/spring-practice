package com.meghana.passportmanagement.service;

import com.meghana.passportmanagement.entity.Passport;

public interface PassportService {

	Passport assignPassportToUser(Passport passport, String username);

	Passport fetchPassport(String passportNumber);

}
