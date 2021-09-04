package com.epam.travel.entity.tests;

public class Hotel {

	private String name;
	private int star;
	private String address;
	private boolean transfer; 
	private String nutrition;

	public Hotel() {
		super();
	}

	public Hotel(String name, int star, String address, boolean transfer, String nutrition) {
		super();
		this.name = name;
		this.star = star;
		this.address = address;
		this.transfer = transfer;
		this.nutrition = nutrition;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isTransfer() {
		return transfer;
	}

	public void setTransfer(boolean transfer) {
		this.transfer = transfer;
	}

	public String getNutrition() {
		return nutrition;
	}

	public void setNutrition(String nutrition) {
		this.nutrition = nutrition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nutrition == null) ? 0 : nutrition.hashCode());
		result = prime * result + star;
		result = prime * result + (transfer ? 1231 : 1237);
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
		if (nutrition == null) {
			if (other.nutrition != null)
				return false;
		} else if (!nutrition.equals(other.nutrition))
			return false;
		if (star != other.star)
			return false;
		if (transfer != other.transfer)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hotel [name=");
		builder.append(name);
		builder.append(", star=");
		builder.append(star);
		builder.append(", address=");
		builder.append(address);
		builder.append(", transfer=");
		builder.append(transfer);
		builder.append(", nutrition=");
		builder.append(nutrition);
		builder.append("]");
		return builder.toString();
	}

}