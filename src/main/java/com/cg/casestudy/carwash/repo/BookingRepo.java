package com.cg.casestudy.carwash.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.casestudy.carwash.document.Bookings;

public interface BookingRepo extends MongoRepository<Bookings, String> {

}
