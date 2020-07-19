package com.cg.casestudy.carwash.service;

import java.util.List;

import com.cg.casestudy.carwash.beans.WashBean;
import com.cg.casestudy.carwash.document.Rating;
import com.cg.casestudy.carwash.document.User;
import com.cg.casestudy.carwash.document.Washer;

public interface WasherService {

	List<WashBean> getWashRequests(String washrId);

	void generateInvoice(String bookingId);

	Rating viewRatings(String bookingId);

	Washer editProfile(Washer washer);

	Washer viewProfile(String Id);

	Rating giveRating(String bookingId,Rating rating);

	boolean login(User user);
	
	boolean changeRequest(WashBean washbean,String washerId);

}
