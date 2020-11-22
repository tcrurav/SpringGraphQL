package com.tiburcio.bicyclesWithGraphQL.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.tiburcio.bicyclesWithGraphQL.entity.models.Bicycle;
import com.tiburcio.bicyclesWithGraphQL.services.IBicycleService;

@Component
public class BicycleMutation implements GraphQLMutationResolver {

	@Autowired
	private IBicycleService bicycleService;
	
	public Bicycle createBicycle(String brand, String model) {
		Bicycle bicycle = new Bicycle(brand, model);
		return bicycleService.addBicycle(bicycle);
	}
}
