package com.cg.casestudy.carwash.service;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.casestudy.carwash.beans.OrderBean;
import com.cg.casestudy.carwash.document.Bookings;
import com.cg.casestudy.carwash.document.Customer;
import com.cg.casestudy.carwash.document.FutureBook;
import com.cg.casestudy.carwash.document.Rating;
import com.cg.casestudy.carwash.document.Receipt;
import com.cg.casestudy.carwash.document.User;
import com.cg.casestudy.carwash.exception.CarwasherException;
import com.cg.casestudy.carwash.repo.BookingRepo;
import com.cg.casestudy.carwash.repo.CustomerRepo;
import com.cg.casestudy.carwash.repo.FutureBookRepo;
import com.cg.casestudy.carwash.repo.PackageRepo;
import com.cg.casestudy.carwash.repo.RatingRepo;
import com.cg.casestudy.carwash.repo.ReceiptRepo;
import com.cg.casestudy.carwash.repo.UserRepo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BookingRepo bookingRepo;

	@Autowired
	private FutureBookRepo futureBookRepo;

	@Autowired
	private ReceiptRepo receiptRepo;

	@Autowired
	private PackageRepo packageRepo;

	@Autowired
	private RatingRepo ratingRepo;

	@Override
	public Customer signup(JSONObject object) {
		Customer customer = null;
		if (null != object) {
			try {
				if (null == customerRepo.findByemail(object.getString("email"))) {
					customer = new Customer(object.getString("name"), object.getString("email"), true, null);
					customer = customerRepo.save(customer);
					userRepo.save(new User(customer.getEmail(), "1234", true, "customer"));
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
		Customer cust = customerRepo.findByemail(customer.getEmail());
		if (customer.getEmail().equals(cust.getEmail())) {
			cust.setName(customer.getName());
			customerRepo.save(cust);
		}
		return cust;
	}

	@Override
	public boolean login(User user) {
		return new JSONObject(userRepo.findPasswordById(user.getId())).get("password").equals(user.getPassword());
	}

	@Override
	public Bookings bookNow(Bookings booking) {
		Bookings newbook = null;
		if (booking.getCustomerEmail() == null) {
			throw new CarwasherException("CustomerEmail cannot be null");
		} else if (booking.getCleaningPackage() == null) {
			throw new CarwasherException("Cleaning package must be selected");
		} else if (booking.getCar().isEmpty()) {
			throw new CarwasherException("Car must be selected");
		} else {

			newbook = bookingRepo.save(booking);
		}

		return newbook;
	}

	@Override
	public FutureBook scheduleBooking(FutureBook upcomingBookings) {
		if (upcomingBookings.getDate() == null || upcomingBookings.getTime() == null) {
			throw new CarwasherException("Date time Must be available");
		}
		return futureBookRepo.save(
				new FutureBook(upcomingBookings.getBooking(), upcomingBookings.getDate(), upcomingBookings.getTime(),
						upcomingBookings.getLatitude(), upcomingBookings.getLongitude(), "Not Assigned"));
	}

	@Override
	public Receipt getReceipt(String id) {

		return receiptRepo.findById(id).get();
	}

	@Override
	public boolean giveRatings(Rating rating, String bookingId) {
		Bookings booking = bookingRepo.findById(bookingId).get();
		booking.setRating(rating);
		ratingRepo.save(rating);
		return bookingRepo.save(booking).getClass() == Bookings.class;
	}

	@Override
	public Customer getProfile(String id) {
		return customerRepo.findById(id).get();
	}

	@Override
	public OrderBean getOrders(String emailId) {
		return new OrderBean(bookingRepo.getAllBookingForUser(emailId),
				futureBookRepo.getAllfuturebookForUser(emailId));
	}

}
