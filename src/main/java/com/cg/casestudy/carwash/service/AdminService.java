package com.cg.casestudy.carwash.service;

import java.util.Map;

import com.cg.casestudy.carwash.document.Addons;
import com.cg.casestudy.carwash.document.Packages;

public interface AdminService {

	public Addons addAddons(Map<String, String> object);
	public Addons editAddons(Addons updatedAddon);
	
	public Packages addPackage(Map<String, String> object);
	public Packages editPackage(Packages updatePackage);
	
}
