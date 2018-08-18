package com.karthik.jersey.restapi;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("sapadu")
public class FoodResource {
	FoodRepository repo= new FoodRepository();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Food> getFoods() {
		return repo.getFoods();
	}
	
	@GET
	@Path("item/{code}")
	@Produces(MediaType.APPLICATION_XML)
	public Food getFood(@PathParam("code") int fCode) {
		return repo.getFood(fCode);
	}
	
	
	
	@POST
	@Path("new")
	public Food createFood(Food food) {
		System.out.println(food);
		repo.createFood(food);
		return food;
	}
}
