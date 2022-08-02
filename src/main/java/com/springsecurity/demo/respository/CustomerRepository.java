package com.springsecurity.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springsecurity.demo.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	public List<Customer> findByEmail(String email);
	public Customer save(Customer customer);

}
