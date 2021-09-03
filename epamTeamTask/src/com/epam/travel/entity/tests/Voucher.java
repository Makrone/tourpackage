package com.epam.travel.entity.tests;

import java.time.LocalDate;

public class Voucher {

	private VoucherList voucherList;
	private String country;
	private Hotel hotel;
	private Double cost;
	private Transfer transfer;
	private LocalDate date;

	public Voucher() {
		super();
	}

	public Voucher(VoucherList voucherList, String country, Hotel hotel, Double cost, Transfer transfer,
			LocalDate date) {
		super();
		this.voucherList = voucherList;
		this.country = country;
		this.hotel = hotel;
		this.cost = cost;
		this.transfer = transfer;
		this.date = date;
	}

	public VoucherList getVoucherList() {
		return voucherList;
	}

	public void setVoucherList(VoucherList voucherList) {
		this.voucherList = voucherList;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Transfer getTransfer() {
		return transfer;
	}

	public void setTransfer(Transfer transfer) {
		this.transfer = transfer;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		result = prime * result + ((voucherList == null) ? 0 : voucherList.hashCode());
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
		Voucher other = (Voucher) obj;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
			return false;
		if (voucherList != other.voucherList)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Voucher [voucherList=");
		builder.append(voucherList);
		builder.append(", country=");
		builder.append(country);
		builder.append(", hotel=");
		builder.append(hotel);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}
	

}
