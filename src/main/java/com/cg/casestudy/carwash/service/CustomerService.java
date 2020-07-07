package com.cg.casestudy.carwash.service;

import org.json.JSONObject;

import com.cg.casestudy.carwash.document.Customer;
import com.cg.casestudy.carwash.document.Order;
import com.cg.casestudy.carwash.document.User;

public interface CustomerService {
	
	public Customer signup(JSONObject customer);
	public Customer editProfile(Customer customer);
	public boolean login(User customer);
	public Order orderNow(Order customerOrder);
		
	

}
