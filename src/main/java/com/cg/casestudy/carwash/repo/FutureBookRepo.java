package com.cg.casestudy.carwash.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.casestudy.carwash.document.FutureBook;

public interface FutureBookRepo extends MongoRepository<FutureBook, String> {

}
