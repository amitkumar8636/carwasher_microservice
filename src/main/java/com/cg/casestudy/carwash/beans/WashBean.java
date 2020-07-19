package com.cg.casestudy.carwash.beans;

import java.io.Serializable;

import com.cg.casestudy.carwash.document.Bookings;

public class WashBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Bookings booking;
	private String status;
	
	
	
	public WashBean(Bookings booking, String status) {
		super();
		this.booking = booking;
		this.status = status;
	}
	
	public Bookings getBooking() {
		return booking;
	}
	public void setBooking(Bookings booking) {
		this.booking = booking;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
