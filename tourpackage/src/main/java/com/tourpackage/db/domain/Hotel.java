package com.tourpackage.db.domain;

public class Hotel {

	private String name;
	private Integer stars;
	private NutritionType nutritionType;
	private boolean animalOption;
	private Integer numberOfAdults;
	private Integer numberOfChildren;

	public Hotel() {
		super();
	}

	public Hotel(String name, Integer stars, NutritionType nutritionType, boolean animalOption, Integer numberOfAdults,
			Integer numberOfChildren) {
		super();
		this.name = name;
		this.stars = stars;
		this.nutritionType = nutritionType;
		this.animalOption = animalOption;
		this.numberOfAdults = numberOfAdults;
		this.numberOfChildren = numberOfChildren;
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

	public NutritionType getNutritionType() {
		return nutritionType;
	}

	public void setNutritionType(NutritionType nutritionType) {
		this.nutritionType = nutritionType;
	}

	public boolean isAnimalOption() {
		return animalOption;
	}

	public void setAnimalOption(boolean animalOption) {
		this.animalOption = animalOption;
	}

	public Integer getNumberOfAdults() {
		return numberOfAdults;
	}

	public void setNumberOfAdults(Integer numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}

	public Integer getNumberOfChildren() {
		return numberOfChildren;
	}

	public void setNumberOfChildren(Integer numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (animalOption ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numberOfAdults == null) ? 0 : numberOfAdults.hashCode());
		result = prime * result + ((numberOfChildren == null) ? 0 : numberOfChildren.hashCode());
		result = prime * result + ((nutritionType == null) ? 0 : nutritionType.hashCode());
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
		if (animalOption != other.animalOption)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfAdults == null) {
			if (other.numberOfAdults != null)
				return false;
		} else if (!numberOfAdults.equals(other.numberOfAdults))
			return false;
		if (numberOfChildren == null) {
			if (other.numberOfChildren != null)
				return false;
		} else if (!numberOfChildren.equals(other.numberOfChildren))
			return false;
		if (nutritionType != other.nutritionType)
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
		builder.append(", nutritionType=");
		builder.append(nutritionType);
		builder.append(", animalOption=");
		builder.append(animalOption);
		builder.append(", numberOfAdults=");
		builder.append(numberOfAdults);
		builder.append(", numberOfChildren=");
		builder.append(numberOfChildren);
		builder.append("]");
		return builder.toString();
	}

}
