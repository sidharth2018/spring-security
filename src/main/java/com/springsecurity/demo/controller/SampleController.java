package com.springsecurity.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.demo.model.Customer;
import com.springsecurity.demo.respository.CustomerRepository;
import com.springsecurity.demo.service.CustomerSecurityService;
import com.springsecurity.demo.service.CustomerService;

@RestController
public class SampleController {
	
	@Autowired
	CustomerRepository repo;
	@Autowired
	CustomerService service;
	
	@GetMapping("/login")
	public void login() {
		
	}
	
	@GetMapping("/name/{username}")
	public String getCustomerName(@PathVariable String username) {
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		System.out.println(auth.getAuthorities());
		return auth.getName();
	}
	
	@GetMapping("/orders")
	public String getCustomerOrders() {
		 return "Orders";
	}
	
	@GetMapping("/contact")
	public String seeGeneralContact() {
		return "Contacts";
	}
	
	@GetMapping("/about")
	public String seeAbout() {
		return "About";
		
	}
	
	@PostMapping("/create")
	public void createUser(@RequestBody Customer cust){
		Customer cus1 = cust;
		service.insertCustomer(cust);
		System.out.println("hi");
		
	}

}

