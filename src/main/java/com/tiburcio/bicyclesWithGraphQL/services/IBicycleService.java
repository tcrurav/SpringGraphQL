package com.tiburcio.bicyclesWithGraphQL.services;

import java.util.List;
import java.util.Optional;
import com.tiburcio.bicyclesWithGraphQL.entity.models.Bicycle;

public interface IBicycleService {

	public List<Bicycle> getAll();
	
	public Optional<Bicycle> getBicycleById(long id);

	public Bicycle addBicycle(Bicycle bicycle);

	public void deleteBicycle(long id);

	public void updateBicycle(long id, Bicycle bicycle);
}
