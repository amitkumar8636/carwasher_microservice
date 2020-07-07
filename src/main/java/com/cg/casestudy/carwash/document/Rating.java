package com.cg.casestudy.carwash.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Rating {

	@Id
	private String id;
	private String reviews;
	private int ratings;

	@DBRef
	private int orderid;

	public Rating(String reviews, int ratings, int orderid) {
		super();
		this.reviews = reviews;
		this.ratings = ratings;
		this.orderid = orderid;
	}

	public String getId() {
		return id;
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

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

}
