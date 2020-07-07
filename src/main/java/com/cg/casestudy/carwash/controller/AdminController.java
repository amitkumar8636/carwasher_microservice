package com.cg.casestudy.carwash.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.casestudy.carwash.exception.CarwasherException;
import com.cg.casestudy.carwash.service.AdminService;

@Repository
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	@PostMapping("/addaddon")
	public boolean addAddon(Map<String,String> addonObj) {
		if (null==addonObj) {
			throw new CarwasherException("Data is invalid to create addon");
		}
		else {
			try {
				adminService.addAddons(addonObj);
			} catch (NullPointerException e) {
				throw new CarwasherException("Data Currupt at service level",e);
			}
		}
		
		return false;
		
	}
	
}
