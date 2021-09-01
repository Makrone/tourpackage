package com.tourpackage.db.domain;

public class Minivan extends Car {

	private Integer seats;

	public Minivan() {
		super();
	}

	public Minivan(Double cost, Double fuelConsumption, CarBrand brand, Double maxSpeed, Integer seats) {
		super(cost, fuelConsumption, brand, maxSpeed);
		this.seats = seats;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((seats == null) ? 0 : seats.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Minivan other = (Minivan) obj;
		if (seats == null) {
			if (other.seats != null)
				return false;
		} else if (!seats.equals(other.seats))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Minivan [Seats=");
		builder.append(seats);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", fuelConsumption=");
		builder.append(fuelConsumption);
		builder.append(", brand=");
		builder.append(brand);
		builder.append(", maxSpeed=");
		builder.append(maxSpeed);
		builder.append("]");
		return builder.toString();
	}

}
