package com.cg.casestudy.carwash.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.carwash.document.Addons;
import com.cg.casestudy.carwash.document.Packages;
import com.cg.casestudy.carwash.exception.CarwasherException;
import com.cg.casestudy.carwash.service.AddOnService;
import com.cg.casestudy.carwash.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/addaddon")
	public Addons addAddon(@RequestBody Map<String,String> addonObj) {
		if (null==addonObj) {
			throw new CarwasherException("Data is invalid to create addon");
		}
		else {
			try {
				System.out.println(addonObj.get("name")+ addonObj.get("price"));
				return adminService.addAddons(addonObj);
			} catch (NullPointerException e) {
				throw new CarwasherException("Data Currupt at service level",e);
			}
		}
		
		
	}
	
	@PostMapping("/addpackage")
	public Packages addPackage(@RequestBody Map<String, String> packages) {
		if (null==packages) {
			throw new CarwasherException("Data is Invalid to create package");
		}
		else {
			 return adminService.addPackage(packages);
		}
	}
	
}
