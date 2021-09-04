package com.epam.travel.entity.tests;

public class Voucher {

	private VoucherList voucherList;
	private String country;
	private Double cost;
	private Transport transport;
	private int dateOfDepartment;

	public Voucher() {
		super();
	}

	public Voucher(VoucherList voucherList, String country, Double cost, Transport transport, int dateOfDepartment) {
		super();
		this.voucherList = voucherList;
		this.country = country;
		this.cost = cost;
		this.transport = transport;
		this.dateOfDepartment = dateOfDepartment;
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

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public int getDateOfDepartment() {
		return dateOfDepartment;
	}

	public void setDateOfDepartment(int dateOfDepartment) {
		this.dateOfDepartment = dateOfDepartment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + dateOfDepartment;
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
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
		if (dateOfDepartment != other.dateOfDepartment)
			return false;
		if (transport == null) {
			if (other.transport != null)
				return false;
		} else if (!transport.equals(other.transport))
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
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", transport=");
		builder.append(transport);
		builder.append(", dateOfDepartment=");
		builder.append(dateOfDepartment);
		builder.append("]");
		return builder.toString();
	}

}
