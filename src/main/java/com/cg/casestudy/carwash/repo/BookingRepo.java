package com.cg.casestudy.carwash.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cg.casestudy.carwash.document.Bookings;

public interface BookingRepo extends MongoRepository<Bookings, String> {

	@Query(value = "{ 'customerEmail' : ?0 }")
	public List<Bookings> getAllBookingForUser(String emailId);
}
