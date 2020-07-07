package com.cg.casestudy.carwash.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Bookings {

	@Id
	private String id;
	private String orderId;
	private Car car;
	private Packages cleaningPackage;
	private List<Addons> addons;
	private String notes;

	public Bookings(String orderId,Car car, Packages cleaningPackage, List<Addons> addons, String notes) {
		super();
		this.orderId= orderId;
		this.car = car;
		this.cleaningPackage = cleaningPackage;
		this.addons = addons;
		this.notes = notes;
	}

	public String getId() {
		return id;
	}

	
	public Car getCar() {
		return car;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public void setCar(Car car) {
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

}
