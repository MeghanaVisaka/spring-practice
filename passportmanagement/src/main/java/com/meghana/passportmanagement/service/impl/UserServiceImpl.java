package com.meghana.passportmanagement.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meghana.passportmanagement.entity.User;
import com.meghana.passportmanagement.repository.UserRepository;
import com.meghana.passportmanagement.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}

	@Override
	public User fetchUser(String username) {
		
		User fetchedUser = userRepository.findByUserName(username);
		
		return fetchedUser;
	}

	@Override
	public User deleteUser(String username) {
		User deletedUser = userRepository.findByUserName(username);
		userRepository.deleteByUserName(username);
		return deletedUser;
	}

	@Override
	public String changePassword(String username, String oldPassword, String newPassword) {
		
		User fetchedUser = userRepository.findByUserName(username);
		String message = null;
		
		if(fetchedUser != null) {
			if(oldPassword.equalsIgnoreCase(fetchedUser.getPassword())) {
				fetchedUser.setPassword(newPassword);
				userRepository.save(fetchedUser);
				message = "Password Updated Successfully";
			}
			else {
				message = "Old Password doesn't match";
			}
		}
		else {
			message = "User does not exist";
		}
		return message;
	}

}
