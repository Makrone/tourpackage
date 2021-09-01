package com.tourpackage.service;

import com.tourpackage.db.dao.CarStore;
import com.tourpackage.db.domain.Car;

public class CarService {
	
	private static final CarStore carStore = new CarStore();
	
	public void create(Car car) { 
		carStore.create(car);
		
	}

}
