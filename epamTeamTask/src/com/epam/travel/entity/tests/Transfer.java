package com.epam.travel.entity.tests;

import java.time.LocalDate;
import java.util.List;

public class Transfer {

	private Double cost;
	private TransferList transfer;
	private LocalDate dateFrom;
	private LocalDate dateTo;

	public Transfer() {
		super();
	}

	public Transfer(Double cost, TransferList transfer, LocalDate dateFrom, LocalDate dateTo) {
		super();
		this.cost = cost;
		this.transfer = transfer;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public TransferList getTransfer() {
		return transfer;
	}

	public void setTransfer(TransferList transfer) {
		this.transfer = transfer;
	}

	public LocalDate getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(LocalDate dateFrom) {
		this.dateFrom = dateFrom;
	}

	public LocalDate getDateTo() {
		return dateTo;
	}

	public void setDateTo(LocalDate dateTo) {
		this.dateTo = dateTo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((dateFrom == null) ? 0 : dateFrom.hashCode());
		result = prime * result + ((dateTo == null) ? 0 : dateTo.hashCode());
		result = prime * result + ((transfer == null) ? 0 : transfer.hashCode());
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
		Transfer other = (Transfer) obj;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (dateFrom == null) {
			if (other.dateFrom != null)
				return false;
		} else if (!dateFrom.equals(other.dateFrom))
			return false;
		if (dateTo == null) {
			if (other.dateTo != null)
				return false;
		} else if (!dateTo.equals(other.dateTo))
			return false;
		if (transfer != other.transfer)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transfer [cost=");
		builder.append(cost);
		builder.append(", transfer=");
		builder.append(transfer);
		builder.append(", dateFrom=");
		builder.append(dateFrom);
		builder.append(", dateTo=");
		builder.append(dateTo);
		builder.append("]");
		return builder.toString();
	}

}
