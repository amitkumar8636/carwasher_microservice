package com.cg.casestudy.carwash.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class Orders {

	@Id
	private String id;
	private String customerEmail;
	private List<Bookings> booking;
	private Rating rating;
	private Receipt receipt;
	private String status;
	
	public Orders(String customerEmail,List<Bookings> washings, Rating rating, Receipt receipt, String status) {
		super();
		this.customerEmail= customerEmail;
		this.booking = washings;
		this.rating = rating;
		this.receipt = receipt;
		this.status = status;
	}

	public String getId() {
		return id;
	}
	
	

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public List<Bookings> getWashings() {
		return booking;
	}

	public void setWashings(List<Bookings> washings) {
		this.booking = washings;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	public Receipt getReceipt() {
		return receipt;
	}

	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
