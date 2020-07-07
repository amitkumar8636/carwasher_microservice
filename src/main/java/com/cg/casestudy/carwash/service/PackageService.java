package com.cg.casestudy.carwash.service;

import java.util.List;
import java.util.Map;

import com.cg.casestudy.carwash.document.Packages;

public interface PackageService {

	
	public Packages addPackage(Map<String, String> object);
	public Packages editPackage(Packages updatePackage);
	
	public List<Packages> getAllPackages();
}
