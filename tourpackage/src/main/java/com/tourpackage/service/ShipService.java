package com.tourpackage.service;

import com.tourpackage.db.dao.ShipStore;
import com.tourpackage.db.domain.Ship;

public class ShipService {

	private static final ShipStore shipStore = new ShipStore();

	public static ShipStore getShipStoreService() { 
		return shipStore;
	}
}
