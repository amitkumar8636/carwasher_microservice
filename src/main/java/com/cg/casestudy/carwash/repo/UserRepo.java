package com.cg.casestudy.carwash.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.casestudy.carwash.document.User;


public interface UserRepo extends MongoRepository<User, String> {

	public User findByemail(String email);
	public String findPasswordByEmail(String email);
}

