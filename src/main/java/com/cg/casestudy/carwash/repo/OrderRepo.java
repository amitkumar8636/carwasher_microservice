package com.cg.casestudy.carwash.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.casestudy.carwash.document.Orders;

public interface OrderRepo extends MongoRepository<Orders, String> {

}
