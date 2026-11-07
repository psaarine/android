package com.pyry.springApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.DriverManager;
import java.sql.Driver;
import java.util.Enumeration;

@RestController
public class IdentityController {

	private ICustomerRepository customerRepository;

	public IdentityController(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@GetMapping("/")
	public String index() {

		customerRepository.getCustomerByCode("ASD");
		return "lol";
	}
} 
