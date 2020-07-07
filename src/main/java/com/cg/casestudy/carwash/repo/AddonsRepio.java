package com.cg.casestudy.carwash.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.casestudy.carwash.document.Addons;

public interface AddonsRepio extends MongoRepository<Addons, String> {

}
