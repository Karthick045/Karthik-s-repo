package com.karthik.jersey.restapi;

import java.util.ArrayList;
import java.util.List;

public class FoodRepository {
	
	List<Food> foodList;
	public FoodRepository() {
		foodList= new ArrayList<>();
		Food f = new Food();
		f.setFoodCode(100);
		f.setName("Pizza");
		f.setPrice(430);
		
		Food f1 = new Food();
		f1.setFoodCode(101);
		f1.setName("Burger");
		f1.setPrice(200);
		foodList.add(f);
		foodList.add(f1);
	}
	
	public List<Food> getFoods(){
		return foodList;
	}
	
	public Food getFood(int fCode) {
		
		for(Food f:foodList) {
			if(f.getFoodCode()==fCode) {
				return f;
			}
		}
		return new Food();
	}

	public void createFood(Food food) {
		foodList.add(food);
	}

}
