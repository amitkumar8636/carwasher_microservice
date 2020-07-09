package com.cg.casestudy.carwash.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.casestudy.carwash.document.Packages;
import com.cg.casestudy.carwash.exception.CarwasherException;
import com.cg.casestudy.carwash.repo.PackageRepo;
import com.mongodb.MongoException;

@Service
public class PackageServiceImpl implements PackageService {

	@Autowired
	private PackageRepo packageRepo;
	@Override
	public Packages addPackage(Map<String, String> object) {
		Packages pack;
		try {
			pack = packageRepo.save(new Packages(object.get("name"), Double.parseDouble(object.get("price"))));

		} catch (MongoException e) {
			throw new CarwasherException("Connection error with database", e);
		}
		return pack;
	}

	@Override
	public Packages editPackage(Packages updatePackage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Packages> getAllPackages() {
		return packageRepo.findAll();
	}
}
