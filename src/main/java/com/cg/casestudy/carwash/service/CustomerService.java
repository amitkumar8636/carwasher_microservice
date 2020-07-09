package com.cg.casestudy.carwash.service;

import org.json.JSONObject;

import com.cg.casestudy.carwash.document.Bookings;
import com.cg.casestudy.carwash.document.Customer;
import com.cg.casestudy.carwash.document.FutureBook;
import com.cg.casestudy.carwash.document.Rating;
import com.cg.casestudy.carwash.document.Receipt;
import com.cg.casestudy.carwash.document.User;

public interface CustomerService {
	
	public Customer signup(JSONObject customer);
	public Customer editProfile(Customer customer);
	public boolean login(User customer);
	public Bookings bookNow(Bookings customerOrder);
	public FutureBook scheduleBooking(FutureBook upcomingBookings);
	public Receipt getReceipt(String id);
	public boolean giveRatings(Rating rating,String bookingId);

}
