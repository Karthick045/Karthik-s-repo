package com.karthik.jersey.restapi;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Food {
	
	@Override
	public String toString() {
		return "Food [name=" + name + ", foodCode=" + foodCode + ", price=" + price + "]";
	}

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
