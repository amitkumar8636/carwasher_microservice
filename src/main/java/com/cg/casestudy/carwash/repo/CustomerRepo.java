package com.cg.casestudy.carwash.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.casestudy.carwash.document.Customer;

public interface CustomerRepo extends MongoRepository<Customer, String> {

	public Customer findByemail(String email);
	
}
