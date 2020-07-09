package com.cg.casestudy.carwash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.casestudy.carwash.document.Car;
import com.cg.casestudy.carwash.repo.CarRepo;

@RestController
public class TempController {
@Autowired
private CarRepo carrepo;
	
	@GetMapping("/addcar")
	public void addcar() {
		Car car = new Car("BMW", "5f06de70109dfd2d5acdf271", "VAR", 2014, true);
		Car car2 = new Car("AUDI R8", "5f06de70109dfd2d5acdf271", "FI", 2014, true);
		Car car3 = new Car("MARUTI 800", "5f06de70109dfd2d5acdf271", "Petrol", 2014, true);
		Car car4 = new Car("Ford", "5f06de70109dfd2d5acdf271", "Eco", 2012, true);
		carrepo.save(car);
		carrepo.save(car2);
		carrepo.save(car3);
		carrepo.save(car4);
	}
	
	@GetMapping("/getCars")
	public List<Car> getallcar() {
		return carrepo.getAllCarsOfUser("5f06de70109dfd2d5acdf271");
	}
}
