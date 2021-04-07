package com.ig.beans;

public class Coffee {

	private String coffeenName;
	private String description;
	private int totalServing;
	
	public Coffee()
	{
		
	}

	public Coffee(String coffeenName, String description, int totalServing) {
		super();
		this.coffeenName = coffeenName;
		this.description = description;
		this.totalServing = totalServing;
	}

	public String getCoffeenName() {
		return coffeenName;
	}

	public void setCoffeenName(String coffeenName) {
		this.coffeenName = coffeenName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTotalServing() {
		return totalServing;
	}

	public void setTotalServing(int totalServing) {
		this.totalServing = totalServing;
	}

	@Override
	public String toString() {
		return "Coffee [coffeenName=" + coffeenName + ", description=" + description + ", totalServing=" + totalServing
				+ "]";
	}
	
}
