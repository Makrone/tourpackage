package com.tourpackage.db.dao;

import java.util.ArrayList;
import java.util.List;

public abstract class Store<T> {

	protected List<T> items = new ArrayList<>();

	public List<T> getAll() {
		return items;
	}

	public boolean remove(T obj) {
		return items.remove(obj);
	}

	public void create(T obj) {
		items.add(obj);
	}

}
