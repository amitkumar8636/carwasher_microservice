package com.cg.casestudy.carwash.document;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Washer {

	@Id
	private String id;
	private String name;
	private String email;
	private boolean isActive;
	private List<Bookings> bookings;
	private Map<String, String> bookingStatus;

	public Washer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
		this.isActive = true;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<Bookings> getBookings() {
		return bookings;
	}

	public void setBookings(List<Bookings> bookings) {
		this.bookings = bookings;
	}

	public Map<String, String> getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(Map<String, String> bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	

	

}
