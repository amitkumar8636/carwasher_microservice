package com.cg.casestudy.carwash.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.carwash.beans.WashBean;
import com.cg.casestudy.carwash.document.Rating;
import com.cg.casestudy.carwash.document.User;
import com.cg.casestudy.carwash.document.Washer;
import com.cg.casestudy.carwash.service.WasherService;

@RestController
@RequestMapping("/washer")
public class WasherController {

	@Autowired
	private WasherService washerService;

	@PostMapping("/login")
	public boolean login(@RequestBody String str) {
		JSONObject obj = new JSONObject(str);
		User user = new User();
		user.setId(obj.getString("id"));
		user.setPassword(obj.getString("password"));
		return washerService.login(user);
	}

	@PostMapping("/ratenow")
	public Rating giveRatings(@RequestBody String ratingObject) {
		JSONObject json = new JSONObject(ratingObject);
		Rating rating = new Rating(json.getString("bookingId"), "Washer", json.getString("reviews"),
				json.getInt("ratings"));
		return washerService.giveRating(json.getString("bookingId"), rating);
	}

	@GetMapping("/washrequest/{id}")
	public List<WashBean> getWashRequests(@PathVariable("id") String washerId) {
		return washerService.getWashRequests(washerId);
	}
	
	@PostMapping("/changewash/{washerId}")
	public boolean changeRequest(@PathVariable("washerId") String washerId,@RequestBody WashBean washBean) {
		return washerService.changeRequest(washBean, washerId);
	}

	@GetMapping("/viewrating/{bookingId}")
	public Rating viewRatings(@PathVariable("bookingId") String bookingId) {
		return washerService.viewRatings(bookingId);
	}

	@PostMapping("/edit")
	public Washer editProfile(@RequestBody Washer washer) {
		return washerService.editProfile(washer);
	}

	@GetMapping("/view/{id}")
	public Washer viewProfile(@PathVariable("id") String id) {
		return washerService.viewProfile(id);
	}
}
