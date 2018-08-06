package com.karthik.jersey.restapi;

public class Food {
	
	private String name;

	private int foodCode;
    
    private int price;
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFoodCode() {
		return foodCode;
	}

	public void setFoodCode(int foodCode) {
		this.foodCode = foodCode;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
