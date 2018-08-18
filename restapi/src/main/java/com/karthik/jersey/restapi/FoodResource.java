package com.karthik.jersey.restapi;

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
		FoodRepository repo= new FoodRepository();
		return repo.getFoods();
	}
}
