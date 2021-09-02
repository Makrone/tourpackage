package com.tourpackage.service;

import com.tourpackage.db.dao.TrainStore;
import com.tourpackage.db.domain.Train;

public class TrainService {

	private static final TrainStore shipStore = new TrainStore();

	public void create(Train train) {
		shipStore.create(train);

	}
}