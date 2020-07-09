package com.cg.casestudy.carwash.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.casestudy.carwash.document.Addons;
import com.cg.casestudy.carwash.exception.CarwasherException;
import com.cg.casestudy.carwash.repo.AddonsRepio;
import com.mongodb.MongoException;

@Service
public class AddOnServiceImpl implements AddOnService {

	@Autowired
	private AddonsRepio addonsRepo;

	@Override
	public Addons addAddons(Map<String, String> object) {
		Addons addons;
		try {
			System.out.println("in addonservice");
			addons = addonsRepo.save(new Addons(object.get("name"), Double.parseDouble(object.get("price"))));

		} catch (MongoException e) {
			throw new CarwasherException("Cannot able to access to database", e);
		}
		return addons;
	}

	@Override
	public Addons editAddons(Addons updatedAddon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Addons> getAllAddons() {
		return addonsRepo.findAll();
	}
}
