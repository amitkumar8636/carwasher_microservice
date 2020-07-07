package com.cg.casestudy.carwash.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Washer {

	@Id
	private String id;
	private String name;
	private String email;
	private boolean active;

	@DBRef
	private List<Order> orders;

	public Washer(String name, String email, boolean active, List<Order> orders) {
		super();

		this.name = name;
		this.email = email;
		this.active = active;
		this.orders = orders;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}
