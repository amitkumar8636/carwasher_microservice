package com.cg.casestudy.carwash.repo;

import org.json.JSONObject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.casestudy.carwash.document.User;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

	  @Query(value="{ 'id' : ?0 }",fields="{ 'password' : 1}")
	public String findPasswordById(String id);
}

