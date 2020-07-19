package com.cg.casestudy.carwash.beans;

import java.io.Serializable;
import java.util.List;

import com.cg.casestudy.carwash.document.Bookings;
import com.cg.casestudy.carwash.document.FutureBook;


public class OrderBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<Bookings> bookings;
	private List<FutureBook> scheduled;
	
	
	public OrderBean(List<Bookings> bookings, List<FutureBook> scheduled) {
		super();
		this.bookings = bookings;
		this.scheduled = scheduled;
	}


	public List<Bookings> getBookings() {
		return bookings;
	}


	public void setBookings(List<Bookings> bookings) {
		this.bookings = bookings;
	}


	public List<FutureBook> getScheduled() {
		return scheduled;
	}


	public void setScheduled(List<FutureBook> scheduled) {
		this.scheduled = scheduled;
	}
	
	
	
	
}
