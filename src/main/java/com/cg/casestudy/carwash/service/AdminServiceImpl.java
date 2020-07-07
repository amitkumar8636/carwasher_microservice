package com.cg.casestudy.carwash.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.casestudy.carwash.document.Addons;
import com.cg.casestudy.carwash.document.Packages;

public class AdminServiceImpl implements AdminService {

	@Autowired
	private AddOnService addOnService;

	@Autowired
	private PackageService packageService;

	@Override
	public Addons addAddons(Map<String, String> object) {
		return addOnService.addAddons(object);
	}

	@Override
	public Addons editAddons(Addons updatedAddon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Packages addPackage(Map<String, String> object) {
		return packageService.addPackage(object);
	}

	@Override
	public Packages editPackage(Packages updatePackage) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
