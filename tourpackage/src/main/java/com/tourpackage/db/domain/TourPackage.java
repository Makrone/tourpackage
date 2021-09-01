package com.tourpackage.db.domain;

import java.time.LocalDate;
import java.util.List;

public class TourPackage {
	
	private Hotel hotel;
	private Car transferToHolelCar;
	private Car transferFromHolelCar;
	private List<TourPackageOption> tourPackageOptions;
	private LocalDate dateFrom;
	private LocalDate dateTo;
	
	public TourPackage () {
		super();
	}
	
	public TourPackage(Hotel hotel, Car transferToHolelCar, Car transferFromHolelCar,
			List<TourPackageOption> tourPackageOptions, LocalDate dateFrom, LocalDate dateTo) {
		super();
		this.hotel = hotel;
		this.transferToHolelCar = transferToHolelCar;
		this.transferFromHolelCar = transferFromHolelCar;
		this.tourPackageOptions = tourPackageOptions;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Car getTransferToHolelCar() {
		return transferToHolelCar;
	}

	public void setTransferToHolelCar(Car transferToHolelCar) {
		this.transferToHolelCar = transferToHolelCar;
	}

	public Car getTransferFromHolelCar() {
		return transferFromHolelCar;
	}

	public void setTransferFromHolelCar(Car transferFromHolelCar) {
		this.transferFromHolelCar = transferFromHolelCar;
	}

	public List<TourPackageOption> getTourPackageOptions() {
		return tourPackageOptions;
	}

	public void setTourPackageOptions(List<TourPackageOption> tourPackageOptions) {
		this.tourPackageOptions = tourPackageOptions;
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
		result = prime * result + ((dateFrom == null) ? 0 : dateFrom.hashCode());
		result = prime * result + ((dateTo == null) ? 0 : dateTo.hashCode());
		result = prime * result + ((hotel == null) ? 0 : hotel.hashCode());
		result = prime * result + ((tourPackageOptions == null) ? 0 : tourPackageOptions.hashCode());
		result = prime * result + ((transferFromHolelCar == null) ? 0 : transferFromHolelCar.hashCode());
		result = prime * result + ((transferToHolelCar == null) ? 0 : transferToHolelCar.hashCode());
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
		TourPackage other = (TourPackage) obj;
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
		if (hotel == null) {
			if (other.hotel != null)
				return false;
		} else if (!hotel.equals(other.hotel))
			return false;
		if (tourPackageOptions == null) {
			if (other.tourPackageOptions != null)
				return false;
		} else if (!tourPackageOptions.equals(other.tourPackageOptions))
			return false;
		if (transferFromHolelCar == null) {
			if (other.transferFromHolelCar != null)
				return false;
		} else if (!transferFromHolelCar.equals(other.transferFromHolelCar))
			return false;
		if (transferToHolelCar == null) {
			if (other.transferToHolelCar != null)
				return false;
		} else if (!transferToHolelCar.equals(other.transferToHolelCar))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TourPackage [hotel=");
		builder.append(hotel);
		builder.append(", transferToHolelCar=");
		builder.append(transferToHolelCar);
		builder.append(", transferFromHolelCar=");
		builder.append(transferFromHolelCar);
		builder.append(", tourPackageOptions=");
		builder.append(tourPackageOptions);
		builder.append(", dateFrom=");
		builder.append(dateFrom);
		builder.append(", dateTo=");
		builder.append(dateTo);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
