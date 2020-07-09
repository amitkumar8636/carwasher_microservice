package com.cg.casestudy.carwash.document;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FutureBook {
 private String id;
 private Bookings booking;
 private LocalDate date;
 private LocalTime time;
 private double latitude;
 private double longitude;
 private String status;
 
 
 
public FutureBook(Bookings booking, LocalDate date, LocalTime time, double latitude, double longitude, String status) {
	super();
	this.booking = booking;
	this.date = date;
	this.time = time;
	this.latitude = latitude;
	this.longitude = longitude;
	this.status = status;
}

public String getId() {
	return id;
}

public Bookings getBooking() {
	return booking;
}
public void setBooking(Bookings booking) {
	this.booking = booking;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public LocalTime getTime() {
	return time;
}
public void setTime(LocalTime time) {
	this.time = time;
}
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
public double getLongitude() {
	return longitude;
}
public void setLongitude(double longitude) {
	this.longitude = longitude;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
	
 
}
