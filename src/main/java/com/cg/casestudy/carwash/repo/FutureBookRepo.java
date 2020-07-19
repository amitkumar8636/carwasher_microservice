package com.cg.casestudy.carwash.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cg.casestudy.carwash.document.FutureBook;

public interface FutureBookRepo extends MongoRepository<FutureBook, String> {

	@Query(value = "{ 'booking.customerEmail' : ?0 }")
	public List<FutureBook> getAllfuturebookForUser(String emailId);
}
