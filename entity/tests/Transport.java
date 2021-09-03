package com.epam.travel.entity.tests;

public class Transport {

	private Double cost;
	private TransportList transport;
	private Integer numberOfSeats;
	private Integer amountOfLuggage;

	public Transport() {
		super();
	}

	public Transport(Double cost, TransportList transport, Integer numberOfSeats, Integer amountOfLuggage) {
		super();
		this.cost = cost;
		this.transport = transport;
		this.numberOfSeats = numberOfSeats;
		this.amountOfLuggage = amountOfLuggage;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public TransportList getTransfer() {
		return transport;
	}

	public void setTransfer(TransportList transfer) {
		this.transport = transfer;
	}

	public Integer getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(Integer numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public Integer getAmountOfLuggage() {
		return amountOfLuggage;
	}

	public void setAmountOfLuggage(Integer amountOfLuggage) {
		this.amountOfLuggage = amountOfLuggage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((amountOfLuggage == null) ? 0 : amountOfLuggage.hashCode());
		result = prime * result + ((cost == null) ? 0 : cost.hashCode());
		result = prime * result + ((numberOfSeats == null) ? 0 : numberOfSeats.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
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
		Transport other = (Transport) obj;
		if (amountOfLuggage == null) {
			if (other.amountOfLuggage != null)
				return false;
		} else if (!amountOfLuggage.equals(other.amountOfLuggage))
			return false;
		if (cost == null) {
			if (other.cost != null)
				return false;
		} else if (!cost.equals(other.cost))
			return false;
		if (numberOfSeats == null) {
			if (other.numberOfSeats != null)
				return false;
		} else if (!numberOfSeats.equals(other.numberOfSeats))
			return false;
		if (transport != other.transport)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Transport [cost=");
		builder.append(cost);
		builder.append(", transport=");
		builder.append(transport);
		builder.append(", numberOfSeats=");
		builder.append(numberOfSeats);
		builder.append(", amountOfLuggage=");
		builder.append(amountOfLuggage);
		builder.append("]");
		return builder.toString();
	}

}
