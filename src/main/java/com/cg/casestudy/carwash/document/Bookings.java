package com.cg.casestudy.carwash.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bookings {

	@Id
	private String id;
	private String customerEmail;
	private List<Car> car;
	private Packages cleaningPackage;
	private List<Addons> addons;
	private String notes;
	private Rating rating;
	private Receipt receipt;
	private String status;
	
	
	public Bookings(String customerEmail, List<Car> car, Packages cleaningPackage, List<Addons> addons, String notes,
			Rating rating, Receipt receipt, String status) {
		super();
		this.customerEmail = customerEmail;
		this.car = car;
		this.cleaningPackage = cleaningPackage;
		this.addons = addons;
		this.notes = notes;
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
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	public Packages getCleaningPackage() {
		return cleaningPackage;
	}
	public void setCleaningPackage(Packages cleaningPackage) {
		this.cleaningPackage = cleaningPackage;
	}
	public List<Addons> getAddons() {
		return addons;
	}
	public void setAddons(List<Addons> addons) {
		this.addons = addons;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
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
