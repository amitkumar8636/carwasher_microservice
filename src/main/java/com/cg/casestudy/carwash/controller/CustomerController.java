package com.cg.casestudy.carwash.controller;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.carwash.document.Customer;
import com.cg.casestudy.carwash.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/signup")
	public Customer signUp(@RequestBody Map<String,String> customer ) {
		JSONObject json = new JSONObject();
		json.put("name",customer.get("name"));
		json.put("email", customer.get("email"));
		return customerService.signup(json);
	}
	
	@GetMapping
	public boolean login() {
		
		return false;
	}
	
//	@PostMapping
//	public void washNow() {
//		//TODO
//	}
	
//	@PostMapping
//	public void scheduleLater() {
//		
//	}
//	
//	@PostMapping
//	public void payNow() {
//		
//	}
//	
//	@PostMapping
//	public void giveRatings() {
//		
//	}
//	
//	@GetMapping
//	public void getReceipt() {
//		
//	}
//	
//	@GetMapping
//	public Customer getProfile() {
//		return null;
//	}
//	
//	@PostMapping
//	public void editProfile(Customer customer) {
//		
//	}
	
	

}
