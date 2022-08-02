package com.springsecurity.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springsecurity.demo.model.Customer;
import com.springsecurity.demo.model.SecurityCustomer;
import com.springsecurity.demo.respository.CustomerRepository;


@Service
public class CustomerSecurityService implements UserDetailsService {
	
	@Autowired
	CustomerRepository respository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<Customer> custs = respository.findByEmail(username);
		if(custs.isEmpty() || custs==null) throw new UsernameNotFoundException("username: "+username+" is not present");
		else return new SecurityCustomer(custs.get(0));
	}

}
