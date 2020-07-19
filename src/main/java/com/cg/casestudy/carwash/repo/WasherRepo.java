package com.cg.casestudy.carwash.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cg.casestudy.carwash.document.Rating;
import com.cg.casestudy.carwash.document.Washer;

public interface WasherRepo extends MongoRepository<Washer, String> {

	@Query(value = "{ 'bookingId' : ?0,'provider':?1 }", fields = "{ 'password' : 1}")
	Rating viewRating(String bookingId, String provider);

}
