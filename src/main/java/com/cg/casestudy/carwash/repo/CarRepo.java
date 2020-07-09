package com.cg.casestudy.carwash.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cg.casestudy.carwash.document.Car;

public interface CarRepo extends MongoRepository<Car, String> {

	@Query(value = "{ 'customerId' : ?0 }")
	public List<Car> getAllCarsOfUser(String customerId);
	
}
