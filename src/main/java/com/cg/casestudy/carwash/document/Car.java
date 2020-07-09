package com.cg.casestudy.carwash.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Car {
	@Id
	private String id;
	private String customerId;
	private String model;
	private String varient;
	private int year;
	private boolean isActive;

	public Car(String model,String customerId, String varient, int year,boolean isActive) {
		super();
		this.customerId= customerId;
		this.model = model;
		this.varient = varient;
		this.year = year;
		this.isActive= isActive;
	}
	

	
	public boolean isActive() {
		return isActive;
	}



	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}



	public String getId() {
		return id;
	}

	public String getCustomerId() {
		return customerId;
	}



	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVarient() {
		return varient;
	}

	public void setVarient(String varient) {
		this.varient = varient;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
