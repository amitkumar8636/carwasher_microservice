package com.cg.casestudy.carwash.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document
public class Rating {

	
	private String reviews;
	private int ratings;
	
	public Rating(String reviews, int ratings) {
		super();
		this.reviews = reviews;
		this.ratings = ratings;
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
