package com.cg.casestudy.carwash.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Packages {

	@Id
	private String id;
	private String name;
	private double amount;

	public Packages(String name, double amount) {
		super();

		this.name = name;
		this.amount = amount;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
