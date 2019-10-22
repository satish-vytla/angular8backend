package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CountryRepository;
import com.example.demo.dao.UserRepository;
import com.example.demo.domain.CountryInfo;
import com.example.demo.domain.UserInfo;

@CrossOrigin
@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CountryRepository countryRepository;

	@GetMapping(path = "/getuser", produces = "application/json")
	public List<UserInfo> getUsers() {
		System.out.println("**** getUsers() ************** ");
		return userRepository.findAll();
	}

	// @PostMapping(path = "/add", produces = "application/json")
	/*
	 * @RequestMapping(value = "/add", method = RequestMethod.POST, produces =
	 * "application/json") public List<UserInfo> postUsers(@RequestBody UserInfo
	 * user) { List<UserInfo> userin = new ArrayList<>(); user.setFullName("Ranj");
	 * user.setEmail("uew"); // user.setAdress(""); userin.add(user);
	 * System.out.println("**** postUsers() ************** ");
	 * 
	 * return userRepository.saveAll(userin); // return null; }
	 */

	@GetMapping(path = "/countrydetails/", produces = "application/json")
	public List<CountryInfo> getCountryInfo() {
		System.out.println("**** getCountryInfo() ************** ");
		return countryRepository.findAll();
	}
}
