package com.tourpackage;

import com.tourpackage.db.domain.Car;
import com.tourpackage.service.ServiceFactory;

public class Application {
	public static final ServiceFactory serviceFactory = new ServiceFactory();

	public static void main(String[] args) {
		
		ServiceFactory.getCarService().create(new Car());
			

	}

}
