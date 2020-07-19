package com.cg.casestudy.carwash.document;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Receipt {

	@Id
	private String id;
	@DBRef
	private Orders order;
	private LocalDate date;
	private float amount;
	private String status;

	public Receipt(Orders order, LocalDate date, float amount, String status) {
		super();
		this.order = order;
		this.date = date;
		this.amount = amount;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
