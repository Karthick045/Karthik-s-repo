package com.karthik.jersey.restapi;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("sapadu")
public class FoodResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Food> getFood() {
		System.out.println("Food details");
		Food f = new Food();
		f.setFoodCode(100);
		f.setName("Pizza");
		f.setPrice(430);
		
		Food f1 = new Food();
		f1.setFoodCode(101);
		f1.setName("Burger");
		f1.setPrice(200);
		List<Food> foodList = Arrays.asList(f,f1);
		return foodList;
	}
}
