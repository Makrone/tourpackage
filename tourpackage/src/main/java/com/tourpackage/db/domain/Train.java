package com.tourpackage.db.domain;

public class Train {

	private Double cost;
	private Double numberOWagon;
	private TrainName name;
	private Double maxSpeed;

	public Train () { 
		super();
	}
	

	public Train(Double cost, Double numberOWagon, TrainName name, Double maxSpeed) {
		super();
		this.cost = cost;
		this.numberOWagon = numberOWagon;
		this.name = name;
		this.maxSpeed = maxSpeed;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(final Double cost) {
		this.cost = cost;
	}

	public Double getNumberOWagon() {
		return numberOWagon;
	}

	public void setNumberOWagon(final Double numberOWagon) {
		this.numberOWagon = numberOWagon;
	}

	public TrainName getName() {
		return name;
	}

	public void setName(final TrainName name) {
		this.name = name;
	}

	public Double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(final Double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Train [cost=");
		builder.append(cost);
		builder.append(", numberOWagon=");
		builder.append(numberOWagon);
		builder.append(", name=");
		builder.append(name);
		builder.append(", maxSpeed=");
		builder.append(maxSpeed);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((maxSpeed == null) ? 0 : maxSpeed.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numberOWagon == null) ? 0 : numberOWagon.hashCode());
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
		Train other = (Train) obj;
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
		if (numberOWagon == null) {
			if (other.numberOWagon != null)
				return false;
		} else if (!numberOWagon.equals(other.numberOWagon))
			return false;
		return true;
	}
}
