package com.cg.casestudy.carwash.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.casestudy.carwash.document.Packages;

public interface PackageRepo extends MongoRepository<Packages, String> {

}
