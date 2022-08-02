package com.springsecurity.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springsecurity.demo.model.Authority;
import com.springsecurity.demo.model.Customer;
import com.springsecurity.demo.respository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository repo;
	
	public void insertCustomer(Customer customer) {
		
		List<Authority> auths = customer.getAuths();
		
		for(Authority a:auths) a.setCustomer(customer);
		customer.setAuths(auths);
		
		repo.save(customer);
		
	}

}
