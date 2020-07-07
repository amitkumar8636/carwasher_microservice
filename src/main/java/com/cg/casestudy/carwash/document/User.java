package com.cg.casestudy.carwash.document;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User {

	private String id;
	private String password;
	private boolean isActive;
	private String role;
	
	
	public User(String id, String password, boolean isActive,String role) {
		super();
		this.id = id;
		this.role=role;
		this.password = password;
		this.isActive = isActive;
	}
	
	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
}
