package com.cg.casestudy.carwash.controller;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.carwash.document.Bookings;
import com.cg.casestudy.carwash.document.Customer;
import com.cg.casestudy.carwash.document.FutureBook;
import com.cg.casestudy.carwash.document.Rating;
import com.cg.casestudy.carwash.document.User;
import com.cg.casestudy.carwash.exception.CarwasherException;
import com.cg.casestudy.carwash.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/signup")
	public Customer signUp(@RequestBody Map<String, String> customer) {
		JSONObject json = new JSONObject();
		json.put("name", customer.get("name"));
		json.put("email", customer.get("email"));
		return customerService.signup(json);
	}

	@PostMapping("/login")
	public boolean login(@RequestBody String str) {
		JSONObject obj = new JSONObject(str);
		User user = new User();
		user.setId(obj.getString("id"));
		user.setPassword(obj.getString("password"));

		return customerService.login(user);
	}

	@PostMapping("/booknow")
	public Bookings bookNow(@RequestBody Bookings booking) {
		if (booking == null) {
			throw new CarwasherException("Invalid data for creating a booking");
		} else {
			return customerService.bookNow(booking);
		}
	}

	@PostMapping("/schedule")
	public FutureBook scheduleLater(@RequestBody FutureBook futureBook) {
		if (futureBook == null) {
			throw new CarwasherException("Invalid data for creating a schedule booking");
		} else {
			return customerService.scheduleBooking(futureBook);
		}
	}
//	
//	@PostMapping
//	public void payNow() {
//		
//	}
//	
	@PostMapping("/ratenow")
	public boolean giveRatings(@RequestBody String ratingObject) {
		JSONObject json = new JSONObject(ratingObject);
		Rating rating = new Rating(json.getString("reviews"), json.getInt("ratings"));
		return customerService.giveRatings(rating, json.getString("bookingId"));
	}
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
