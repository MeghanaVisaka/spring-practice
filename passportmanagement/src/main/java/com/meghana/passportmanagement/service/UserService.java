package com.meghana.passportmanagement.service;

import org.springframework.transaction.annotation.Transactional;

import com.meghana.passportmanagement.entity.User;

public interface UserService {

	User registerUser(User user);

	User fetchUser(String username);

	@Transactional
	User deleteUser(String username);

	String changePassword(String username, String oldPassword, String newPassword);

}
