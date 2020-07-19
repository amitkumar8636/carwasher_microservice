package com.cg.casestudy.carwash.service;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.casestudy.carwash.beans.WashBean;
import com.cg.casestudy.carwash.document.Bookings;
import com.cg.casestudy.carwash.document.Rating;
import com.cg.casestudy.carwash.document.User;
import com.cg.casestudy.carwash.document.Washer;
import com.cg.casestudy.carwash.repo.RatingRepo;
import com.cg.casestudy.carwash.repo.UserRepo;
import com.cg.casestudy.carwash.repo.WasherRepo;

@Service
public class WasherServiceImpl implements WasherService {

	@Autowired
	private WasherRepo washerRepo;
	
	@Autowired
	private RatingRepo ratingRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public List<WashBean> getWashRequests(String washrId) {
		Washer washer = washerRepo.findById(washrId).get();
		List<WashBean> washBeans = new ArrayList<>();
		for (Bookings book : washer.getBookings()) {
			washBeans.
			add(new WashBean(book, washer.getBookingStatus().get(book.getId())));
		}
		return washBeans;
	}

	@Override
	public Rating giveRating(String bookingId,Rating rating) {
		Rating ratingObj = new Rating(bookingId, "Washer", rating.getReviews(), rating.getRatings());
		return ratingRepo.save(ratingObj);
	}

	@Override
	public void generateInvoice(String bookingId) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean login(User user) {
		return new JSONObject(userRepo.findPasswordById(user.getId())).get("password").equals(user.getPassword());
	}

	@Override
	public Rating viewRatings(String bookingId) {
		return washerRepo.viewRating(bookingId, "Washer");
	}

	@Override
	public Washer editProfile(Washer washer) {
		return washerRepo.save(washer);
	}

	@Override
	public Washer viewProfile(String id) {
		return washerRepo.findById(id).get();
	}

	@Override
	public boolean changeRequest(WashBean washbean,String washerId) {
		washbean.getBooking().getId();
		Washer washer = washerRepo.findById(washerId).get();
		washer.getBookingStatus().put(washbean.getBooking().getId(), washbean.getStatus());
		washerRepo.save(washer);
		return washerRepo.save(washer).getClass()==Washer.class;
	}

}
