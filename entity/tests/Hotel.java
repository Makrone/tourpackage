package com.epam.travel.entity.tests;

public class Hotel {

	private String name;
	private Integer stars;
	private String address;
	private boolean nutrition;

	public Hotel() {
		super();
	}

	public Hotel(String name, Integer stars, String address, boolean nutrition) {
		super();
		this.name = name;
		this.stars = stars;
		this.address = address;
		this.nutrition = nutrition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStars() {
		return stars;
	}

	public void setStars(Integer stars) {
		this.stars = stars;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isNutrition() {
		return nutrition;
	}

	public void setNutrition(boolean nutrition) {
		this.nutrition = nutrition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (nutrition ? 1231 : 1237);
		result = prime * result + ((stars == null) ? 0 : stars.hashCode());
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
		Hotel other = (Hotel) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nutrition != other.nutrition)
			return false;
		if (stars == null) {
			if (other.stars != null)
				return false;
		} else if (!stars.equals(other.stars))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hotel [name=");
		builder.append(name);
		builder.append(", stars=");
		builder.append(stars);
		builder.append(", address=");
		builder.append(address);
		builder.append(", nutrition=");
		builder.append(nutrition);
		builder.append("]");
		return builder.toString();
	}

}