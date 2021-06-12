package com.meghana.passportmanagement.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meghana.passportmanagement.dto.PassportDto;
import com.meghana.passportmanagement.entity.Passport;
import com.meghana.passportmanagement.service.PassportService;

@RestController
@RequestMapping(value = "/passport")
public class PassportController {
	
	@Autowired
	PassportService passportService;
	
	ModelMapper modelMapper = new ModelMapper();
	
	PassportDto passportDto = new PassportDto();
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String loadHome() {
		return "Welcome to Passport Home";
	}
	
	@RequestMapping(value = "/assignpassport", method = RequestMethod.POST)
	public Passport assignPassport(@RequestBody Passport passport, @RequestParam String username) {
		Passport assignedPassport = passportService.assignPassportToUser(passport, username);
		return assignedPassport;
	}
	
	@RequestMapping(value = "/fetchpassport", method = RequestMethod.GET)
	public PassportDto fetchPassport(@RequestParam(name="passportnumber") String passportNumber) {
		Passport fetchedPassport = passportService.fetchPassport(passportNumber);
		modelMapper.map(fetchedPassport, passportDto);
		return passportDto;
		
	}

}
