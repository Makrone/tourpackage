package com.tourpackage.db.domain;

public class Ship {

	private Double cost;
	private Double numberOfCabin;
	private ShipName name;
	private Double maxSpeed;

	public Ship() {
		super();
	}

	public Ship(Double cost, Double numberOfCabin, ShipName name, Double maxSpeed) {
		super();
		this.cost = cost;
		this.numberOfCabin = numberOfCabin;
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(final Double cost) {
		this.cost = cost;
	}

	public Double getNumberOfCabin() {
		return numberOfCabin;
	}

	public void setNumberOfCabin(final Double numberOfCabin) {
		this.numberOfCabin = numberOfCabin;
	}

	public ShipName getName() {
		return name;
	}

	public void setName(final ShipName name) {
		this.name = name;
	}

	public Double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(final Double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((maxSpeed == null) ? 0 : maxSpeed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numberOfCabin == null) ? 0 : numberOfCabin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ship other = (Ship) obj;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (maxSpeed == null) {
			if (other.maxSpeed != null)
				return false;
		} else if (!maxSpeed.equals(other.maxSpeed))
			return false;
		if (name != other.name)
			return false;
		if (numberOfCabin == null) {
			if (other.numberOfCabin != null)
				return false;
		} else if (!numberOfCabin.equals(other.numberOfCabin))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ship [cost=");
		builder.append(cost);
		builder.append(", numberOfCabin=");
		builder.append(numberOfCabin);
		builder.append(", name=");
		builder.append(name);
		builder.append(", maxSpeed=");
		builder.append(maxSpeed);
		builder.append("]");
		return builder.toString();
	}


}
