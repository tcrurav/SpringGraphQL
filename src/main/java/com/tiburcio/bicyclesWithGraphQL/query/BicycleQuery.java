package com.tiburcio.bicyclesWithGraphQL.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import java.util.Optional;
import com.tiburcio.bicyclesWithGraphQL.entity.models.Bicycle;
import com.tiburcio.bicyclesWithGraphQL.services.IBicycleService;

@Component
public class BicycleQuery implements GraphQLQueryResolver {
	
	@Autowired
	private IBicycleService bicycleService;
	
	public List<Bicycle> getBicycles(){
		return bicycleService.getAll();
	}
	
	public Optional<Bicycle> getBicycle(final long id){
		return bicycleService.getBicycleById(id);
	}
}
