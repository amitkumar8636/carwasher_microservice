package com.cg.casestudy.carwash.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.casestudy.carwash.document.Customer;
import com.cg.casestudy.carwash.document.Order;
import com.cg.casestudy.carwash.document.User;
import com.cg.casestudy.carwash.exception.CarwasherException;
import com.cg.casestudy.carwash.repo.CustomerRepo;
import com.cg.casestudy.carwash.repo.OrderRepo;
import com.cg.casestudy.carwash.repo.UserRepo;
import com.mongodb.MongoException;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private OrderRepo orderRepo;

	@Override
	public Customer signup(JSONObject object) {
		Customer customer = null;
		if (null != object) {
			try {
				if (null == customerRepo.findByemail(object.getString("email"))) {
					customer = new Customer(object.getString("name"), object.getString("email"), true, null);
					customer = customerRepo.save(customer);
					userRepo.save(new User(customer.getEmail(), "1234", true,"customer"));
				} else {
					throw new CarwasherException("user Already exist");
				}
			} catch (JSONException e) {
				throw new CarwasherException("Invalid Data posted for signup");
			}
		}
		return customer;
	}

	@Override
	public Customer editProfile(Customer customer) {
		Customer cust =  customerRepo.findByemail(customer.getEmail());
		if (customer.getEmail().equals(cust.getEmail())) {
			cust.setName(customer.getName());
			customerRepo.save(cust);
		}
		return null;
	}

	@Override
	public boolean login(User user) {
		return userRepo.findPasswordByEmail(user.getId()).equals(user.getPassword());
	}

	@Override
	public Order orderNow(Order customerOrder) {
		Order order=null;
		try {
			order = orderRepo.save(customerOrder);
		} catch (MongoException e) {
			throw new CarwasherException("Unable to handle request with database",e);
		}
		
		return order;
	}

}
