package com.tourpackage.service;

public class ServiceFactory {
	
	private final static  CarService carService = new CarService();
	
	public static CarService getCarService() { 		// 
		return carService;	
	}

}
