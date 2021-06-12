package com.meghana.passportmanagement.controller;

import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meghana.passportmanagement.dto.UserDto;
import com.meghana.passportmanagement.entity.User;
import com.meghana.passportmanagement.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	UserService userService;

	ModelMapper modelMapper = new ModelMapper();

	UserDto userDto = new UserDto();

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String loadHome() {
		return "Welcome to User Home";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public User registerUser(@RequestBody User user) {
		User savedUser = userService.registerUser(user);
		return savedUser;

	}

	@RequestMapping(value = "/fetchuser", method = RequestMethod.GET)
	public UserDto fetchUser(@RequestParam(name = "username") String username) {
		User fetchedUser = userService.fetchUser(username);
		modelMapper.map(fetchedUser, userDto);
		return userDto;
	}

	@RequestMapping(value = "/deleteuser", method = RequestMethod.DELETE)
	public User deleteUser(@RequestParam(name = "username") String username) {
		User deletedUser = userService.deleteUser(username);
		return deletedUser;

	}

	@RequestMapping(value = "/changepwd", method = RequestMethod.PUT)
	public String changePassword(@RequestHeader(name = "username") String username,
			@RequestHeader(name = "oldpassword") String oldPassword,
			@RequestHeader(name = "newpassword") String newPassword) {

		String message = userService.changePassword(username, oldPassword, newPassword);

		return message;
	}

}
