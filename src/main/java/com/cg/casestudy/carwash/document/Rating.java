package com.cg.casestudy.carwash.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Rating {

	@Id
	private String id;
	private String bookingId;
	private String provider;
	private String reviews;
	private int ratings;
	
	
	
	public Rating(String bookingId, String provider, String reviews, int ratings) {
		super();
		this.bookingId = bookingId;
		this.provider = provider;
		this.reviews = reviews;
		this.ratings = ratings;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	
}
