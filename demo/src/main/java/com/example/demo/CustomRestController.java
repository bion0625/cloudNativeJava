package com.example.demo;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomRestController {
	private final CustomerService customerService;
	public CustomRestController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/customers")
	public Collection<Customer> readAll() {
		return this.customerService.findAll();
	}
}
