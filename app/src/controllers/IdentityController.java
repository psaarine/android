package com.pyry.springApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.SQLException;

@RestController
public class IdentityController {

	private ICustomerRepository customerRepository;

	public IdentityController(ICustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@GetMapping("/")
	public String index() {

		try {
			customerRepository.getCustomerByCode("ASD");
		} catch (SQLException ex) {
		
			return "Internal error while executing sql";
		}
		return "lol";
	}
} 
