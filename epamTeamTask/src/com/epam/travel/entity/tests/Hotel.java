package com.epam.travel.entity.tests;

public class Hotel {

	private String name;
	private Integer stars;
	private String address;
	private VoucherList voucher;
	private boolean animalOption;

	public Hotel() {
		super();
	}

	public Hotel(String name, Integer stars, String address, VoucherList voucher, boolean animalOption) {
		super();
		this.name = name;
		this.stars = stars;
		this.address = address;
		this.voucher = voucher;
		this.animalOption = animalOption;
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

	public VoucherList getVoucher() {
		return voucher;
	}

	public void setVoucher(VoucherList voucher) {
		this.voucher = voucher;
	}

	public boolean isAnimalOption() {
		return animalOption;
	}

	public void setAnimalOption(boolean animalOption) {
		this.animalOption = animalOption;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (animalOption ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((stars == null) ? 0 : stars.hashCode());
		result = prime * result + ((voucher == null) ? 0 : voucher.hashCode());
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
		if (animalOption != other.animalOption)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (stars == null) {
			if (other.stars != null)
				return false;
		} else if (!stars.equals(other.stars))
			return false;
		if (voucher != other.voucher)
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
		builder.append(", voucher=");
		builder.append(voucher);
		builder.append(", animalOption=");
		builder.append(animalOption);
		builder.append("]");
		return builder.toString();
	}

}